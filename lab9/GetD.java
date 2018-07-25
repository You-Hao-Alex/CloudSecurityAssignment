package lab9;

import java.util.Scanner;


public class GetD {
	int n2;
	int e;
	int a = 2;
	int d = 1;
	public void Encryption(){
		System.out.println("please enter your e");
		Scanner aaa = new Scanner(System.in);
		e = aaa.nextInt();
		System.out.println("please enter your n2");
		n2 = aaa.nextInt();
		
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
		int j = 0;
		do {
			j=(d*e)%n2;
			d = d+1;
		}while(j != 1 );
		d=d-1;
		System.out.println("Choose private key: d = "+d);
		
	}
		public static void main(String[] args) {
			GetD newGame = new GetD();
			newGame.Encryption();	
	}
}