void main() {
    Rabbit rabbitOne = new Rabbit("Косой","5 кг","35 см","Белый");
    IO.println("Что хочет кролик? "+ rabbitOne.whatDoesTheRabbitWant());
    IO.println("Что еще хочет кролик? "+ rabbitOne.whatDoesTheRabbitWant());
    IO.println("А потом что хочет кролик? "+ rabbitOne.whatDoesTheRabbitWant());

}

public class Rabbit {
    String name, weight, height, color;

    public Rabbit(String name, String weight, String height, String color) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    public Rabbit() {
        this.name = IO.readln("Введите имя ");
        this.weight = IO.readln("Введите вес");
        this.height = IO.readln("Введите размер");
        this.color = IO.readln("Введите окрас");
        ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String whatDoesTheRabbitWant() {
    String[] str = {"ничего","хочет есть","хочет пить",
                    "хочет играть","хочет бегать","хочет играть",
                    "хочет спать","хочет морковку","хочет прыгать"};
    Random random = new Random();
    int number = random.nextInt(9);
    return (str[number]);
    }

}
