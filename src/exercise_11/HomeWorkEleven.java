package exercise_11;

//11.Задать пустой целочисленный массив длиной 100.
//С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;

import java.util.Arrays;

public class HomeWorkEleven {
    public static void main(String[] args) {
        int[] mas = new int [100];
        for(int i =0; i < mas.length; i++){
            mas[i] = i + 1;
        }
        System.out.println(Arrays.toString(mas));
    }
}

