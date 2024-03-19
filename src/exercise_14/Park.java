package exercise_14;

//14. Создать класс Park с внутренним классом,
//с помощью объектов которого можно хранить информацию об аттракционах,
//времени их работы и стоимости.


public class Park {

    String attractions;
    String timeWork;
    double cash;

    public Park(String attractions, String timeWork, double cash) {
        this.attractions = attractions;
        this.timeWork = timeWork;
        this.cash = cash;
    }

    private class ParkWork{
        public void Schedule(){
            System.out.println("Schedule: \n" + "Name: " + attractions + "\n" + "Time: "  + timeWork + "\n" + "Cash: "+ cash);
        }

    }
    void Display(){
        ParkWork parkWork = new ParkWork();
        parkWork.Schedule();
    }



}
