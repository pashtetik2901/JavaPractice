package main.my_package;

import java.util.Stack;

public class Calculater {
//    private boolean turn;
//
//    public boolean isTurn() {
//        return turn;
//    }
//
//    public void setTurn(boolean turn) {
//        this.turn = turn;
//    }

    public static Boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException err) {
            return false;
        }
    }

    public static double start(String str) {
        if (str == null) {
            throw new ArithmeticException("Вы ввели пустую строку");
        }
        Stack<Double> stack = new Stack<>();

        String check = str.trim();
        if (check.isEmpty()) {
            throw new ArithmeticException("Пустое выражение");
        }

        String[] buf = str.trim().split("\\s+");

        for (String elem : buf) {
            switch (elem) {
                case "+": {
                    double x1 = stack.pop();
                    double x2 = stack.pop();
                    stack.push(x1 + x2);
                    break;
                }
                case "-": {
                    double x1 = stack.pop();
                    double x2 = stack.pop();
                    stack.push(x2 - x1);
                    break;
                }
                case "*": {
                    double x1 = stack.pop();
                    double x2 = stack.pop();
                    stack.push(x2 * x1);
                    break;
                }
                case "/": {
                    double x1 = stack.pop();
                    double x2 = stack.pop();
                    stack.push(x2 / x1);
                    break;
                }
                default: {
                    if (!isNumeric(elem)) {
                        throw new ArithmeticException("Нет такого числа/символа");
                    }
                    stack.push(Double.parseDouble(elem));
                }
            }

        }
        if (stack.size() != 1) {
            throw new ArithmeticException("Нерпвильное выражение");
        }
        return stack.pop();
    }
}
