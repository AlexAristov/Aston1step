import customCollections.CustomArrayList;
import customSort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list2 = new CustomArrayList<>(5);

        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(6);
        list2.add(18);
        list2.add(3);
        list2.add(9);
        list2.add(5);
        list2.add(7);

        System.out.println(list2);

        BubbleSort.sort(list2);

        System.out.println(list2);
    }
}
