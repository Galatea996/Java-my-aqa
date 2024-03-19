package exercise_14;

public class Main extends Park{
    public Main(String attractions, String timeWork, double cash) {
        super(attractions, timeWork, cash);
    }

    public static void main(String[] args) {
        Park park  = new Park("Kарусель ", " 15:00 ", 12.00);
        park.Display();

    }
}
