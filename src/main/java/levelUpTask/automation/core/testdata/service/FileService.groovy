package levelUpTask.automation.core.testdata.service

interface FileService {

    void writeStringsToFile(List<String> strings)

    boolean isFileContainsAllStrings(List<String> strings)

}
