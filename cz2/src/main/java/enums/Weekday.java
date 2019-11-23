package enums;

public enum Weekday {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean workday;

    Weekday(boolean workday) {
        this.workday = workday;
    }

    public boolean isWorkday() {
        return workday;
    }
}
