import java.util.Scanner;

public class Vombat {

    static void main(String[] args) {
        Animal vombat = new Animal();

        vombat.age = 3;
        vombat.areal = "Австралия";
        vombat.name = "Вомбат Коля";
        vombat.gender = "Мужской";
        vombat.legs = 4;
        System.out.printf("В этой клетке живет:  %s, его Родина %s, его возраст %d года, у него %d лапы.\n", vombat.name, vombat.areal, vombat.age, vombat.legs);

        System.out.println("Хочешь его погладить (напиши да или нет)?");
        Scanner scanner = new Scanner(System.in);
        var answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {

            System.out.println("точно??");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("да")) {
                vombat.print();
            } else {
                System.out.println("Но он же такой миииииииленький");
            }
        } else {
            vombat.print();
        }
    }

    static class Animal {
        String areal, name, gender;
        int legs, age;
        double height;

        void print() {
            System.out.println("КУСЬ!");
        }
    }
}
