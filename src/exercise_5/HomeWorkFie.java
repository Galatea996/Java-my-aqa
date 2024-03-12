package exercise_5;

//5. Написать метод,
//принимающий на вход два целых числа и проверяющий,
//что их сумма лежит в пределах от 10 до 20 (включительно),
//если да – вернуть true,
//в противном случае – false.

public class HomeWorkFie {

    public static void NumberInt(){
        int a = 10;
        int b = 30;
        int summ = a + b;
        boolean v = summ >= 10 && summ <= 20;
        System.out.println(v);
    }
}
