package task_8;

public class InvertNumber {
    private int number;

    public InvertNumber(int num){
        this.number = num;
    }

    public int invert(){
        String num = String.valueOf(number);
        StringBuilder builder = new StringBuilder(num);

        int result = Integer.valueOf(builder.reverse().toString());
        return result;
    }
}
