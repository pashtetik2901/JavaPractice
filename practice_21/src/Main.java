import my_package.Catalog;
import my_package.Storage;
import my_package.TaskOther;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = TaskOther.toList(arr);
        System.out.println(list.toString());
        System.out.println("\n--------------------\n");

        System.out.println("Задание №2");
        Storage<Integer> arr2 = new Storage<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(arr2.toString());
        System.out.println("\n-------------------\n");

        System.out.println("Задание №3");
        System.out.println(arr2.getElement(2));
        System.out.println("\n-------------------\n");

        System.out.println("Задание №4");
        Catalog[] catalogs = new Catalog[]{
                new Catalog("test1", 1000),
                new Catalog("test2", 2000),
                new Catalog("test3", 3000),
                new Catalog("test4", 4000),
                new Catalog("test5", 5000),
                new Catalog("test6", 6000),
                new Catalog("test7", 7000),
                new Catalog("test8", 8000),
        };
        Storage<Catalog> storage = new Storage<>(catalogs);
        storage.getFiveElements();
        System.out.println("\n--------------------\n");
    }
}