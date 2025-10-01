package task_8;

public class Polindrom {
    private String text;

    public Polindrom(String text){
        this.text = text;
    }

    public String isPolindrom(){
        StringBuilder builder = new StringBuilder(text.toLowerCase());
        if(text.toLowerCase().equals(builder.reverse().toString())){
            return "YES";
        }
        else{
            return "NO";
        }
    }

}
