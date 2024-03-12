package exercise_2;

//2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
//        и инициализируйте их любыми значениями, которыми захотите.
//        Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
//        то вывести в консоль сообщение “Сумма положительная”,
//        в противном случае - “Сумма отрицательная”;



public class HomeWorkTwo {
    public static void checkSumSign(){
        int a = 10;
        int b = 15;
        if (a + b >= 0){
            System.out.println("Summ OK");
        } else {
            System.out.println("Summ No");
        }
}
    }

