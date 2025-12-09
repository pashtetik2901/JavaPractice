import task_1.InvertArray;
import task_2.MyIterator;
import task_3.MyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = InvertArray.invert(arr);
        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("----------------\n");

        System.out.println("Задание №2");
        MyIterator<Integer> iterator = new MyIterator<>(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator.next());
        System.out.println("----------------\n");

        System.out.println("Задание №3");
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        MyIterator<Integer> iterator2 = new MyIterator<>(list);
        System.out.println(iterator2.next());
        System.out.println(iterator2.next());
        System.out.println(iterator2.next());
        iterator2.remove();
        System.out.println(iterator2.next());
    }
}