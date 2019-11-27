package levelUpTask.automation.framework.enums;

public enum Category {

    BRANDS("brands"),
    FILM_CAMERAS("574"),
    WEBCAMS("577");

    private String id;

    Category(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
