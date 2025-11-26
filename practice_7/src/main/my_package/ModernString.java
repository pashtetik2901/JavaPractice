package main.my_package;

public class ModernString implements WorkString {
    private String str;

    public ModernString(String str) {
        this.str = str;
    }

    @Override
    public int getCount(char symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (symbol == str.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    @Override
    public String getPosition() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String getInvert() {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }
}
