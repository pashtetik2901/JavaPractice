package my_package;

public class Catalog {
    private String name;
    private int price;

    public Catalog(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Catalog{" + "name=" + name + ", price=" + price + '}';
    }
}
