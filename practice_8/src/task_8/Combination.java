package task_8;

public class Combination {
    private int a;
    private int b;

    public Combination(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int ways(){
        if(a-b >= 2){
            return 0;
        }
        return (int) Math.pow(2, a);

    }

    public int countSequences(int a, int b) {
        // Если нулей больше, чем (единиц + 1), таких последовательностей нет
        if (a > b + 1) {
            return 0;
        }

        // dp[i][j][0] - количество последовательностей с i нулями и j единицами, заканчивающихся на 0
        // dp[i][j][1] - то же самое, заканчивающихся на 1
        int[][][] dp = new int[a + 1][b + 1][2];

        // Начальные условия
        if (a > 0) dp[1][0][0] = 1; // Последовательность из одного нуля
        if (b > 0) dp[0][1][1] = 1; // Последовательность из одной единицы

        // Заполняем таблицу dp
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i == 0 && j == 0) continue;
                if (i > 0) {
                    // Добавляем 0 (можно только после 1)
                    dp[i][j][0] += (j <= b ? dp[i - 1][j][1] : 0);
                }
                if (j > 0) {
                    // Добавляем 1 (можно после 0 или 1)
                    dp[i][j][1] += dp[i][j - 1][0] + dp[i][j - 1][1];
                }
            }
        }

        // Возвращаем сумму вариантов с окончанием на 0 и 1
        return dp[a][b][0] + dp[a][b][1];
    }
}
