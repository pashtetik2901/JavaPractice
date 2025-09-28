import practik_3.Converter;
import practik_3.RandomArray;
import practik_3.SecondTopic;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Converter con = new Converter(100);
        System.out.println(con.convert_to_USD());
        System.out.println(con.convert_to_CNY());
        System.out.println(con.convert_to_EUR());
    }
}