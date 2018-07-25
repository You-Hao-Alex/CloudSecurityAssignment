package Assignment_RSA;

import java.util.Scanner;

public class Main {
	int p = 533;
	int q = 233;
	int n = p*q;
	int n2 = (p-1)*(q-1);
	int a = 101;
	int e = 0;
	int d = 1;
	public void Encryption(){
		System.out.println("Key generation:");
		System.out.println("p = " + p + "; q = " + q);
		System.out.println("n = p*q = " + n + "; (n) = (p-1)*(q-1) = " + n2);
		
		do {
			int d=a;
			int f=n2;
			int c;
			while ((c = f % d) != 0) {
				f=d;
				d=c;
			}
			if (d==1) {
				e = a;
			}
			a = a + 1;
		}while(e == 0);
		System.out.println("Choose public key: e = "+e);
		int j = 0;
		do {
			j=(d*e)%n2;
			d = d+1;
		}while(j != 1 );
		d=d-1;
		System.out.println("Choose private key: d = "+d);
		
		System.out.println("---------------------------------------------");
		System.out.println("Signing:");
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter your plaintext (number): ");
		int p = reader.nextInt();
		long s = expo(p, d);
		System.out.println("S = "+s);
		
		System.out.println("---------------------------------------------");
		System.out.println("Verifying:");
		System.out.print("Please enter your ciphertext (number): ");
		int q = reader.nextInt();
		long m = expo(q, e);
		System.out.print("M = "+ m);
		}
		/*
		   private long expoi(int a, int b) {
			 long result = 1;
			 for (int i=0;i<b;i++) {
				 result = (result * a)%n;
			 }
			return result;
	}
	*/
		private long expo(int a, int b) {
			 long result1 = 1;
			 do {
				 long result = a;
				 int i = 1;
			 do {
				 result = (result*result)%n;
				 i = i * 2;
				
			 }while(2*i < b);
			 b = b-i;
			 result1 = (result1 * result)%n;
			
			 }while(b>=2);
			 if (b == 1) {
				 result1 = (result1*a)%n;
			 }
			return result1;
	}
		
		
		public static void main(String[] args) {
			Main newGame = new Main();
			newGame.Encryption();	
	}
}
