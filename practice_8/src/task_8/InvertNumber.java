package task_8;

public class InvertNumber {
    private int number;

    public InvertNumber(int num){
        this.number = num;
    }

    public InvertNumber(){}

    public int invert(){
        String num = String.valueOf(number);
        StringBuilder builder = new StringBuilder(num);

        int result = Integer.valueOf(builder.reverse().toString());
        return result;
    }

    public int reverse(int number) {
        return reverseHelper(number, 0);
    }

    private static int reverseHelper(int number, int result) {
        if (number == 0)
            return result;
        int lastDigit = number % 10;
        result = result * 10 + lastDigit;
        return reverseHelper(number / 10, result);
    }
}
