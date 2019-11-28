package enums.exercise;

public enum Months {
    JANUARY(31),
    FEBRUARY(29),
    MARCH (31),
    APRIL (30),
    MAY (31),
    JUNE (30),
    JULY (31);


    private final int days;

    Months (int days) {
        this.days=days;
    }
    public int getMonths () {
        return days;
    }
}
