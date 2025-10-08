package task_8;

public class Combination {
    private int a;
    private int b;

    public Combination(int a, int b){
        this.a = a;
        this.b = b;
    }


    // Публичный метод — вызывается с a и b
    public long countSequences(int a, int b) {
        // Если нулей слишком много — невозможно разместить без соседства
        if (a > b + 1) {
            return 0;
        }
        return countRec(a, b, false);
    }

    // Рекурсивная функция
    private static long countRec(int zerosLeft, int onesLeft, boolean lastWasZero) {
        // Базовый случай: всё разместили
        if (zerosLeft == 0 && onesLeft == 0) {
            return 1;
        }

        long total = 0;

        // Всегда можно поставить единицу, если она осталась
        if (onesLeft > 0) {
            total += countRec(zerosLeft, onesLeft - 1, false);
        }

        // Можно поставить ноль, только если:
        // - остались нули
        // - и предыдущий символ не был нулём
        if (zerosLeft > 0 && !lastWasZero) {
            total += countRec(zerosLeft - 1, onesLeft, true);
        }

        return total;
    }


}
