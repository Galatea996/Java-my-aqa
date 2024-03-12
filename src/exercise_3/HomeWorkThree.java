package exercise_3;

//3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//        Если value меньше 0 (0 включительно),
//        то в консоль метод должен вывести сообщение “Красный”,
//        если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
//        то “Желтый”,
//        если больше 100 (100 исключительно) - “Зеленый”;

public class HomeWorkThree {
    public static  void printColor(){
        int value = 150;
        if ( value < 5 ) {
            System.out.println("Red");
        } else if ( value >= 0 && value <= 100){
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
        {
        }
    }
}
