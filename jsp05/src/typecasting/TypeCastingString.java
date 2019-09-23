package typecasting;

public class TypeCastingString {
   //Strin-float-int
	public static void main(String[] args) {
		 String c = "35.f";
		 float a = Float.parseFloat(c);
		 int b = (int)a +1;
		// TODO Auto-generated method stub
      System.out.print(b);
	}

}
