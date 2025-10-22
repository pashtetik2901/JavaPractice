public class PhoneNumber {
    private String first_string;
    private String right_string;

    public PhoneNumber(String str) {
        this.first_string = str;
        this.right_string = convert(first_string);
    }

    private String convert(String first_string) {
        StringBuilder builder = new StringBuilder();
        if (this.first_string.charAt(0) == '+') {
            String code = new String(this.first_string.substring(0, 2));
            builder.append(code);
            builder.append('(' +
                    this.first_string.substring(2, 5) +
                    ")-" +
                    this.first_string.substring(5, 8) +
                    '-' +
                    this.first_string.substring(8, this.first_string.length())
            );
        } else {
            int code = Character.getNumericValue(first_string.charAt(0)) - 1;
            builder.append('+');
            builder.append(code);
            builder.append('(' +
                    this.first_string.substring(1, 4) +
                    ")-" +
                    this.first_string.substring(4, 7) +
                    '-' +
                    this.first_string.substring(7, this.first_string.length())
            );
        }


        return builder.toString();
    }

    public String getFirstNumber() {
        return first_string;
    }

    public void setFirstNumber(String first_string) {
        this.first_string = first_string;
    }

    public String getRightNumber() {
        return right_string;
    }

    public void setRightNumber(String right_string) {
        this.right_string = right_string;
    }
}
