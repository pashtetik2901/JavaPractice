package main;

import main.my_package.Calculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Чтобы остановить калькулятор напишите /quit"
        );
        Scanner sc = new Scanner(System.in);

        while (true) {
            String pat = sc.nextLine();
            if (pat.equals("/quit")) break;
            System.out.println("Ответ: " + Calculater.start(pat));
        }

        System.out.println("Калькулятор завершил работу");
    }
}