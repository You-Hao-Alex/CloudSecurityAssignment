package lab9;

import java.util.Scanner;


public class Fast {
	int a,b,n;
	
	public void Encryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a: ");
		a = reader.nextInt();
		System.out.println("Please enter b: ");
		b = reader.nextInt();
		System.out.println("Please enter n: ");
		n = reader.nextInt();
		System.out.print(b+" = ");
		long c = expo(a,b);
		System.out.println(" ");
		System.out.println("result = " + c);
	}
		
		
		private long expo(int a, int b) {
			 long result1 = 1;
			 do {
				 long result = a;
				 int i = 1;
			 do {
				 result = (result*result)%n;
				 i = i * 2;
				
			 }while(2*i < b);
			 System.out.print(i+" + ");
			 b = b-i;
			 result1 = (result1 * result)%n;
			
			 }while(b>=2);
			 if (b == 1) {
				 result1 = (result1*a)%n;
				 System.out.print("1");
				 return result1;
			 }
			 else {
				 System.out.print(" ");
			return result1;
			 }
			 }
		
	
		public static void main(String[] args) {
			Fast newGame = new Fast();
			newGame.Encryption();	
	}
}