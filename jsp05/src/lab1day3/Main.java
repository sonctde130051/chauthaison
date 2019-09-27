package lab1day3;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"NGUYEN VAN A",3000, new Job(1,"HR"));
	    Employee emp2 = new Employee(2, "Nguyen Van B",4000, new Job(2,"BA"));
	    Employee emp3 = new Employee(3, "Nguyen Van C",5000, new Job(3,"Tester"));
	    Employee emp4 = new Employee(4, "Nguyen Van D",6000, new Job(4,"Developer"));
	    Employee emp5 = new Employee(5, "Nguyen Van E",7000, new Job(5,"CEO"));
	    System.out.print("Please input size of array: ");  
		Scanner input = new Scanner(System.in);
   	    int number = input.nextInt();
   	
		Employee[] eA = new Employee[number];
		eA[0] = emp1; 
		eA[1] = emp2;
		eA[2] = emp3;
		eA[3] = emp4;
		eA[4] = emp5;
		
		for(int i=0; i<=eA.length-1; i++) {
			System.out.println("Employee information: ");
			System.out.println(+eA[i].id); 
			System.out.println("Name: " +eA[i].name);
			System.out.println("Salary: " +eA[i].salary);
			System.out.println("Job: " +eA[i].job);
       }
  
		
		System.out.println("-----Menu-----");
		System.out.println("1. Create employee.");
		System.out.println("2. Show the existing employee.");
		System.out.println("3. Exit.");
		// TODO Auto-generated method stub
	   System.out.print("Choose:");
       Scanner scanner = new Scanner(System.in);
       int choose = scanner.nextInt();
       
       switch(choose) {
       case 1 :
    	   System.out.println("1.Create employee");
    	   inPut();
    	   break;
    	   		
       case 2 :
    	   System.out.println("2.Show the existing employee");
    	   outPut();
    	   break;
    	   
       case 3 :
    	   System.out.println("3.Exit");
    	   break;
    	   
       default :
    	   System.out.println();
       }
	}

}
