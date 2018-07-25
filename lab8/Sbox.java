package lab8;

import java.util.Scanner;


public class Sbox {
	int i;
	int a,b,c,d,x,y;
	char[] gg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public void Encryption(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your input: ");
		i = reader.nextInt();
		a = i%10;
		b = (i%100)/10;
		c = (i%1000)/100;
		d = (i%10000)/1000;
		if ((d==0 && a ==0 && c==0 && b==1)||(d==0 && a ==1 && c==1 && b==1)||(d==1 && a ==0 && c==0 && b==0)) {
			x=0;
		}
		else if ((d==0 && a ==0 && c==0 && b==0)||(d==0 && a ==1 && c==1 && b==0)||(d==1 && a ==0 && c==1 && b==0)||(d==1 && a ==1 && c==0 && b==1)) {
			x=1;
		}
		else if ((d==0 && a ==0 && c==1 && b==1)||(d==0 && a ==1 && c==0 && b==1)||(d==1 && a ==0 && c==0 && b==1)||(d==1 && a ==1 && c==1 && b==1)) {
			x=2;
		}
		else {
			x=3;
		}
		if ((d==0 && a ==0 && c==0 && b==1)||(d==0 && a ==1 && c==1 && b==0)||(d==1 && a ==0 && c==1 && b==0)||(d==1 && a ==1 && c==0 && b==1)) {
			y=1;
		}
		else if ((d==0 && a ==0 && c==1 && b==0)||(d==0 && a ==1 && c==0 && b==0)||(d==1 && a ==1 && c==0 && b==0)) {
			y=2;
		}
		else if ((d==0 && a ==0 && c==1 && b==1)||(d==0 && a ==1 && c==1 && b==1)||(d==1 && a ==0 && c==0 && b==0)||(d==1 && a ==1 && c==1 && b==1)) {
			y=3;
		}
		else {
			y=0;
		}
		System.out.println("S0 is "+tran(x));
		System.out.println("S1 is "+tran(y));
	}
		private String tran(int a) {
		if (a==0) {
			return "00";
		}
		else if(a==1) {
			return "01";
		}
		else if (a==2) {
			return "10";
		}
		else {
			return "11";
		}
		
	}
		public static void main(String[] args) {
			Sbox newGame = new Sbox();
			newGame.Encryption();	
	}
}