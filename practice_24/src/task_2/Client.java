package task_2;

public class Client {
    Chair chair;

    public void sit() {
        System.out.println(chair.toString());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
