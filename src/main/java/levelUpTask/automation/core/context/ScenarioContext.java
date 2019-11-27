package levelUpTask.automation.core.context;

public class ScenarioContext {

    public static TestEnvironmentContext environmentContext = new TestEnvironmentContext();

    public static void clear() {
        environmentContext = new TestEnvironmentContext();
    }

}
