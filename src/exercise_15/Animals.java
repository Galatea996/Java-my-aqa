package exercise_15;


public class Animals {

    String name;
    String ran;
    String swim;

    public Animals(){

    }

    public Animals(String ran, String name) {
        this.name = name;
        this.ran = ran;
//        this.swim = swim;
    }

    public void RanAnimals(){
        System.out.println("Dog " + name + " ranning " + ran);
    }
//
//    public void RanAnimals(int i) {
//    }
}
