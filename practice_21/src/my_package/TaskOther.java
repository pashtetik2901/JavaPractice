package my_package;

import java.util.Arrays;
import java.util.List;

public class TaskOther {
    public static <T> List<T> toList(T[] arr) {
        return Arrays.asList(arr);
    }


}
