
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.setName("Obelix");
        cat2.setName("Pipi");
        cat3.setName("Luci");

        cat1.setHeight(0.3);
        cat2.setHeight(0.32);
        cat3.setHeight(0.5);

        cat1.setWeight(4.9);
        cat2.setWeight(6.2);
        cat3.setWeight(8.9);

        System.out.println(cat1);

    }
}
