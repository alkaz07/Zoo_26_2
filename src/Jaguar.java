import java.util.Scanner;

public class Jaguar {
    public static void main(String[] args) {
        System.out.println("Ягуар бегает быстрее всех!");
        // ягуары умеют: Есть /спать /зевать /мяукать /бегать /оставлять следы
        JaguarFootprint();
        JaguarFootprintRun();
    }

    private static void JaguarFootprintRun() {
        System.out.println("Введи любое число от 3 до 5");
        Scanner scanner = new Scanner(System.in);
        int run = scanner.nextInt();
        for (int i=0; i<run; i++) {
        System.out.println("     *        *        *        *   ");
        System.out.println("*        *        *        *        *"); }
        System.out.println("А здесь он за кем-то пробежался. АААААААА!!!!");
    }

    public static void JaguarFootprint() {
        // Схематическое представление следа лапы ягуары
        System.out.println("  *   *   *   *   ");
        System.out.println("*   *   *   *   *");
        System.out.println("Обнаружены следы крупной кошки.");
    }
}