public class PhoneNumber {
    private String first_string;
    private String right_string;

    public  PhoneNumber(String str){
        this.first_string = str;
        this.right_string = "";
    }

    private void convert(){
        StringBuilder builder = new StringBuilder();
        if (first_string.charAt(0) == '+') {
            String code = new String(first_string.substring(2));
            builder.append(code);
        }
        else{
            int code = new Integer(first_string.charAt(0));
            code = code - 1;
            builder.append('+');
            builder.append(code);
        }

        builder.append('(' + )
    }


}
