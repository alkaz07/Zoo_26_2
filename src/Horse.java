public class Horse {
    public void makeSound() {
        System.out.println(getClass().toString() + " говорит: Иго-го!");
    }

    public static void main(String[] args) {
        Horse horse = new Horse(); // создаём объект
        horse.makeSound();         // вызываем метод у объекта
    }
}
