package strings;

public class Main {

    public static void main(String[] args) {
        System.out.println("info" + "Share" + "Academy"); // infoShareAcademy

        System.out.println("infoShareAcademy".toLowerCase()); // infoshareacademy

        System.out.println("infoShareAcademy".toUpperCase()); // INFOSHAREACADEMY

        System.out.println("info,Share,Academy".split(",")[1]); // Share

        System.out.println("infoShareAcademy".length()); // 16

        System.out.println("infoShareAcademy".charAt(10)); // c

        System.out.println("infoShareAcademy".contains("Share")); // true


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            stringBuilder.append("a");
        }

        System.out.println(stringBuilder.toString());
    }
}
