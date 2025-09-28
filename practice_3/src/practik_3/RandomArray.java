package practik_3;

import java.util.Random;

public class RandomArray { // Номер-3 Раздел-1 Практика-3
    public RandomArray(){}

    public void execute(){
//        int[] arr = {1, 2, 3, 4};
        int[] arr = new int[4];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((99-10)+10);
        }
        for(int num: arr){
            System.out.printf("%d ", num);
        }
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                flag = false;
                System.out.println("\nНе возрастающий");
                break;
            }
        }
        if (flag) {
            System.out.println("\nМассив возрастающий");
        }
    }
}
