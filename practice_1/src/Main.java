import java.lang.*;
import java.util.Scanner;

public class Main {
    static final int NUMBER = 100;
    static final double PI = 3.141592;

    public static void main(String[] args){
        String msg;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Text: \n");
        msg = scan.nextLine();
        System.out.printf("You entered: " + msg);
    }

}

