package task_3;

public class Dog implements Nameable{
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}
