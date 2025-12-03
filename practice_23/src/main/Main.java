package main;


import main.my_package.ArrayQueue;
import main.my_package.ArrayQueueADT;
import main.my_package.ArrayQueueModule;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        try {
            ArrayQueueModule.enqueue(5);
            ArrayQueueModule.enqueue(10);
            ArrayQueueModule.enqueue(1);
            System.out.println("Element: " + ArrayQueueModule.element());
            System.out.println("Size: " + ArrayQueueModule.size());
            System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
            System.out.println("Size: " + ArrayQueueModule.size());
            System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
            System.out.println("Size: " + ArrayQueueModule.size());
            System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
            ArrayQueueModule.enqueue(100);
            System.out.println("Size: " + ArrayQueueModule.size());
            System.out.println("Dequeue: " + ArrayQueueModule.dequeue());
            System.out.println("Size: " + ArrayQueueModule.size());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.out.println("\n------------------------\n");

        System.out.println("Задание №2");
        try {
            ArrayQueueADT q = new ArrayQueueADT();
            ArrayQueueADT.enqueue(q, 5);
            ArrayQueueADT.enqueue(q, 10);
            ArrayQueueADT.enqueue(q, 1);
            System.out.println("Element: " + ArrayQueueADT.element(q));
            System.out.println("Size: " + ArrayQueueADT.size(q));
            System.out.println("Dequeue: " + ArrayQueueADT.dequeue(q));
            System.out.println("Size: " + ArrayQueueADT.size(q));
            System.out.println("Dequeue: " + ArrayQueueADT.dequeue(q));
            System.out.println("Size: " + ArrayQueueADT.size(q));
            System.out.println("Dequeue: " + ArrayQueueADT.dequeue(q));
            ArrayQueueADT.enqueue(q, 100);
            System.out.println("Size: " + ArrayQueueADT.size(q));
            System.out.println("Dequeue: " + ArrayQueueADT.dequeue(q));
            System.out.println("Size: " + ArrayQueueADT.size(q));
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.out.println("\n------------------------\n");

        System.out.println("Задание №3");
        try {
            ArrayQueue q = new ArrayQueue();
            q.enqueue(5);
            q.enqueue(10);
            q.enqueue(1);
            System.out.println("Element: " + q.element());
            System.out.println("Size: " + q.size());
            System.out.println("Dequeue: " + q.dequeue());
            System.out.println("Size: " + q.size());
            System.out.println("Dequeue: " + q.dequeue());
            System.out.println("Size: " + q.size());
            System.out.println("Dequeue: " + q.dequeue());
            q.enqueue(100);
            System.out.println("Size: " + q.size());
            System.out.println("Dequeue: " + q.dequeue());
            System.out.println("Size: " + q.size());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.out.println("\n------------------------\n");
    }
}