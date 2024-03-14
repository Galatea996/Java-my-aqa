package exercise_10;

//10.Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//С помощью цикла и условия заменить 0 на 1, 1 на 0;

import java.util.Arrays;

public class HomeWorkTen {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i]++;
            } else {
                arr[i]--;
            }
    }
        System.out.print(Arrays.toString(arr));
}}
