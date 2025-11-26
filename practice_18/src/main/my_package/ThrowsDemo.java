package main.my_package;

public class ThrowsDemo {
    public static void keyException(String key) {
        if (key == null) {
            throw new NullPointerException("error with key");
        }
        System.out.printf("New String: %s\n", key);
    }

    public void getDetails(String key) {
        for (int i = 0; i < 2; i++) {
            try {
                System.out.printf("Попытка №%d\n", i + 1);
                keyException(key);
                break;
            } catch (NullPointerException err) {
                if (i == 0) {
                    continue;
                }
                System.out.printf("Error: %s", err);
            }
        }
    }
}
