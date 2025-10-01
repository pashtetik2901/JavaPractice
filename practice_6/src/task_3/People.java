package task_3;

public class People implements Nameable{
    private String name;

    public People(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }
}
