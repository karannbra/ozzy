package comparing;

public class Main {

    public static void main(String[] args) {
        System.out.println(1 > 4);  // false
        System.out.println(1 == 4); // false
        System.out.println(1 != 4); // true
        System.out.println(Long.valueOf(1234234) == Long.valueOf(1234234)); // false
        System.out.println(1234234 == Long.valueOf(1234234)); // true
    }
}
