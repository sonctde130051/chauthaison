package lab1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student st1 = new Student("Dave","boy",6);
       Student st2 = new Student("Join","boy",7); 
       Student st3 = new Student("Juni","girls",6);
       System.out.println("Student :");
       System.out.println("---------------------");
       System.out.println("Student1 :"+ st1.name + " "+ st1.gender +" "+ st1.age);
       System.out.println("---------------------");
       System.out.println("---------------------");
       System.out.println("Student1 :"+ st2.name + " "+ st2.gender +" "+ st2.age);
       System.out.println("---------------------");
       System.out.println("Student1 :"+ st3.name + " "+ st3.gender +" "+ st3.age);
       System.out.println("---------------------");
	}
}
