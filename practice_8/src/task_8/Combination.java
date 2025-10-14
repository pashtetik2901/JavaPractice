package task_8;

public class Combination {
    private int a;
    private int b;

    public Combination(int a, int b){
        this.a = a;
        this.b = b;
    }



    public long countSequences(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        return countRec(a, b, false);
    }


    private static long countRec(int zerosLeft, int onesLeft, boolean lastWasZero) {

        if (zerosLeft == 0 && onesLeft == 0) {
            return 1;
        }

        long total = 0;


        if (onesLeft > 0) {
            total += countRec(zerosLeft, onesLeft - 1, false);
        }

        if (zerosLeft > 0 && !lastWasZero) {
            total += countRec(zerosLeft - 1, onesLeft, true);
        }

        return total;
    }


}
