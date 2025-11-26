package main.my_package;

public class Order {
    public static String checkINN(String inn) throws InnException {
        String new_str = inn.replaceAll(" ", "");
        if (new_str.length() == 12 && new_str.matches("\\d+")) {
            return inn;
        } else {
            throw new InnException("error with inn");
        }
    }

    public void startOrder(String name, String surname, String father_name, String inn) {
        try {
            String checked_inn = checkINN(inn);
            System.out.println(
                    "Заказ создан:{\n" +
                            "Имя: " + name + "\n" +
                            "Фамилия: " + surname + "\n" +
                            "Отчество: " + father_name + "\n" +
                            "ИНН: " + inn + "\n}"

            );
        } catch (InnException e) {
            System.out.println("У вас неправильный ИНН");
        } catch (Exception err) {
            System.out.println("Ошибка с чем-то еще");
        }
    }
}
