package lab2;

public class Dog {
    public String name;
    public int age;
    public String color;
    Dog(String name, int age, String  color){
    	this.name = name;
    	this.age = age;
    	this.color = color;
    }
    //wagging the tail, barking, eating vay duoi, sua, an
    public static void wagging(String waggingTheTail) {
    	System.out.println("Dog "+ waggingTheTail);
    }

}



