import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            originalList.add(i);
        }

        System.out.println("Llista original:");
        System.out.println(originalList);

        List<Integer> reversedList = new ArrayList<>();

        ListIterator<Integer> iterator = originalList.listIterator(originalList.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }

        System.out.println("Llista invertida:");
        System.out.println(reversedList);
    }
}