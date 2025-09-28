package practik_2;

import java.util.Arrays;


public class Shop {
    private Computer []catalog;

    public Shop(int size){
        this.catalog = new Computer[size];
        for (int i = 0; i < size; i++) {
            catalog[i] = new Computer();
        }
    }

    public void add(String name, double cost){
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i].isEmpty()) {
                catalog[i].setCost(cost);
                catalog[i].setName(name);
                break;
            }
        }
    }

    public void remove(String name){
        for (int i = 0; i < catalog.length; i++) {
            if(catalog[i].getName() == name){
                catalog[i] = new Computer();
                break;
            }
        }
    }

    public Computer search(String name){
        for (int i = 0; i < catalog.length; i++) {
            if(catalog[i].getName().equals(name)){
                return catalog[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "catalog=" + Arrays.toString(catalog) +
                '}';
    }
}
