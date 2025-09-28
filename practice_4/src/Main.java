import work_enum.Season;
import work_extend.Circle;
import work_extend.Rectangle;
import work_extend.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 10);
        System.out.println(rec.toString());
        System.out.println("-----------------");

        Circle circle = new Circle(10);
        System.out.println(circle.toString());
        System.out.println("-----------------");

        Square scr = new Square(10, 20);
        System.out.println(scr.toString());
        System.out.println("-----------------");

        Season season = Season.SUMMER;
        System.out.println(season.getDescription());
        System.out.println(season.getFavorite(season));
    }
}