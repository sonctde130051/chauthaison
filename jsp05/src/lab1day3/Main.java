package lab1day3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int choose;
       Scanner scanner = new Scanner(System.in);
       choose = scanner.nextInt();
       System.out.println("Choose:");
       switch(choose) {
       case 1 :
    	   System.out.println("Create employee");
    	   		
       case 2 :
    	   System.out.println("Show the existing employee");
    	   
       case 3 :
    	   System.out.println("Exit");
    	   
       }
	}

}
