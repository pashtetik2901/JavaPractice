package practik_2;


public class Computer {
    private String name;
    private double cost;

    public Computer(){}


    public Computer(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isEmpty(){
        if (name == null && cost == 0.0){
            return  true;
        }
        else{
            return  false;
        }
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
