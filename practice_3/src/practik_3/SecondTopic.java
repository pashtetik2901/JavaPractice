package practik_3;

public class SecondTopic { // Перввый номер из раздела 2
    public SecondTopic(){}

    public void execute(){
        double d = Double.parseDouble("3.14");
        System.out.printf("Преобразованое 1 = %f\n", d);

        String s = "2.05";
        d = Double.parseDouble(s);
        System.out.printf("Преобразование 2 = %f\n", d);

        int obj_int = (int) d;
        long obj_long = (long) d;
        byte obj_byte = (byte) d;
        System.out.println(obj_byte);

        double new_d = 5.55;
        s = Double.toString(new_d);
        System.out.printf("Преобразованная строка - %s", s);
    }
}
