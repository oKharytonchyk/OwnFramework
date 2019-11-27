package levelUpTask.automation.core.testdata.service

import org.apache.commons.io.FileUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

import javax.annotation.PostConstruct

/**
 *  This service can be refactored as @Service('SuggestedProductsFileService')
 *  in case of business logic, which want to save data to another file
 */
@Service
class FileServiceImpl implements FileService {

    @Value('${filename}')
    private String filename

    @Value('${encoding}')
    private String encoding

    private File file

    @Override
    void writeStringsToFile(List<String> strings) {
        strings.eachWithIndex { it, index ->
            writeToFile("${index + 1}: ${it} \n")
        }
        writeToFile('\n')
    }

    @Override
    boolean isFileContainsAllStrings(List<String> strings) {
        strings.stream().allMatch {
            FileUtils.readFileToString(file, encoding).contains(it)
        }
    }

    private writeToFile(String string) {
        FileUtils.writeStringToFile(file, string, encoding, true)
    }

    @PostConstruct
    void init() {
        this.file = new File(filename)

        if (!this.file.canWrite()) {
            System.out.println("I cannot write in file: ${filename}")
        }
    }

}
