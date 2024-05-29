import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Obelix", 0.3, 4.9);
        Cat cat3 = new Cat("Luci", 0.5, 8.9);
        Cat cat2 = new Cat("Pipi", 0.32, 9.2);

        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);

        catList.sort(Comparator.comparing(c -> c.getHeight()));

        printCats(catList);

        System.out.println();

        catList.sort(Comparator.comparing(c -> c.getWeight()));

        printCats(catList);
    }

    private static void printCats(ArrayList<Cat> catList) {
        for (Cat cat : catList) {
            System.out.println(cat);
        }
    }
}
