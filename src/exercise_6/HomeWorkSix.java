package exercise_6;

//6. Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль,
//положительное ли число передали или отрицательное.
//Замечание: ноль считаем положительным числом.

public class HomeWorkSix {

    public static void NnumberToEnter(){
        int a = 1000;
        if (a > 0){
            System.out.println("Ok");
        }
        else if (a<0 && a!=0 ){
            System.out.println("No");

        }
    }
}
