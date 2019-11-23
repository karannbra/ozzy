package generics;

public class Main {

    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        Container<Integer> integerContainer = new Container<>();

        stringContainer.add("name", "Zbyszko");
        integerContainer.add("age", 35);

        System.out.println(stringContainer.get("name")); // Zbyszko
        System.out.println(integerContainer.get("age")); // 35

    }
}
