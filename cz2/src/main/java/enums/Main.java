package enums;

import static enums.Weekday.FRIDAY;
import static enums.Weekday.SATURDAY;

public class Main {

    public static void main(String[] args) {
        printStatus(FRIDAY);
        printStatus(SATURDAY);
    }


    private static void printStatus(Weekday weekday) {
        String status = weekday.isWorkday() ? "Pracuję" : "Spię!";
        System.out.println(status);
    }
}
