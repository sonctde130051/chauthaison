package lab2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("Xu",6," Vang");
		Dog dog2 = new Dog("Beo",8," Den");
		Dog dog3 = new Dog("Bo",4,"Nau");
		System.out.println("Dog:");
		System.out.println("---------------------");
		print(dog1, 1);
		print(dog2, 2);
		print(dog3, 3);
		dog1.wagging("Sua nhieu");

	}
	public static void print(Dog dog, int id) {
		System.out.println("Dog" +id + ":"+ dog.name+" "+dog.age + " " +dog.color);
	}
}