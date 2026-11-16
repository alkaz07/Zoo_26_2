import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Horse {
    private String name;
    private String color;
    private String size;
    private String activity;

    private static final Random RANDOM = new Random();

    private static final String[] NAMES = {
            "Буцефал", "Гром", "Заря", "Ветер", "Сокол", "Молния", "Пегас", "Орлик"
    };
    private static final String[] COLORS = {
            "гнедая", "вороная", "рыжая", "серая", "белая", "буланая"
    };
    private static final String[] SIZES = {
            "маленькая", "средняя", "крупная"
    };
    private static final String[] ACTIVITIES = {
            "бежит", "пасётся", "говорит игого", "спит"
    };

    // Конструктор без параметров — случайная лошадь
    public Horse() {
        this.name = NAMES[RANDOM.nextInt(NAMES.length)];
        this.color = COLORS[RANDOM.nextInt(COLORS.length)];
        this.size = SIZES[RANDOM.nextInt(SIZES.length)];
        this.activity = ACTIVITIES[RANDOM.nextInt(ACTIVITIES.length)];
    }

    // Конструктор с параметрами
    public Horse(String name, String color, String size, String activity) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.activity = activity;
    }


    public void performActivity() {
        switch (activity) {
            case "бежит":
                System.out.println(color + ", " + size + " по кличке " + name + " бежит!");
                break;
            case "пасётся":
                System.out.println(color + ", " + size + " по кличке " + name + " пасётся на лугу.");
                break;
            case "говорит игого":
                System.out.println(color + ", " + size + " по кличке " + name + " говорит: Иго-го!");
                break;
            case "спит":
                System.out.println(color + ", " + size + " по кличке " + name + " спит.");
                break;
            default:
                System.out.println(color + ", " + size + " по кличке " + name + " резерв");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getActivity() {
        return activity;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "кличка='" + name + '\'' +
                ", цвет='" + color + '\'' +
                ", размер='" + size + '\'' +
                ", активность='" + activity + '\'' +
                '}';
    }


    // Точка входа — чтобы можно было запустить класс
    public static void main(String[] args) {
        int getHorseCount = Integer.parseInt(IO.readln("Введите количество лошадок в табуне: "));
        for (int i = 0; i < getHorseCount; i++) {
            Horse horse = new Horse(); // случайная лошадь
            System.out.print((i + 1) + "-ая лошадь ");
            horse.performActivity();
            System.out.println("---");
        }
    }
}
