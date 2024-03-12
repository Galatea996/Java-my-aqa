package exercise_9;

import java.util.Scanner;

//9.Написать метод, который определяет, является ли год високосным,
//и возвращает boolean (високосный - true, не високосный - false).
//Каждый 4-й год является високосным, кроме каждого 100-го,
//при этом каждый 400-й – високосный.
public class HomeWorkNine {

    public static void Year(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if( num % 4 == 0 && num % 100 != 0 || num % 400 == 0 ){
            System.out.println("Leap year");
        } else {
            System.out.println("No leap year");
        }


    }
}
