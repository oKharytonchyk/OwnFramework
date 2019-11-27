package levelUpTask.automation.core.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ProfileUtils {

    @Autowired
    private Environment environment;

    public boolean isMobile() {
        return Arrays.stream(environment.getActiveProfiles()).anyMatch(profile -> profile.contains("mobile"));
    }

}
