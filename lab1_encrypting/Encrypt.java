package lab1_encrypting;

import java.util.Scanner;

public class Encrypt {
	String a;
	int b,c,d;
	Scanner reader = new Scanner(System.in);
	String[] aaa;
	String[] bbb;
	String[] ccc;
	String[] ddd;
	String[] eee;
	
	

	public void encryption(){
		System.out.println("Please enter a sentence (without space): ");
		a = reader.nextLine();
		b = a.length();
		c = b/5;
		d = b%5;
	if (d==1) {
		aaa = new String[c+1];
		bbb = new String[c];
		ccc = new String[c];
		ddd = new String[c];
		eee = new String[c];
	}
	else if (d==2) {
		aaa = new String[c+1];
		bbb = new String[c+1];
		ccc = new String[c];
		ddd = new String[c];
		eee = new String[c];
	}
	else if (d==3) {
		aaa = new String[c+1];
		bbb = new String[c+1];
		ccc = new String[c+1];
		ddd = new String[c];
		eee = new String[c];
	}
	else if (d==4) {
		aaa = new String[c+1];
		bbb = new String[c+1];
		ccc = new String[c+1];
		ddd = new String[c+1];
		eee = new String[c];
	}
	else {
		aaa = new String[c];
		bbb = new String[c];
		ccc = new String[c];
		ddd = new String[c];
		eee = new String[c];
	}

	for (int i = 0; i < aaa.length; i++) {
		aaa[i] = String.valueOf(a.charAt(i));
	}
	for (int i = 0, j = aaa.length; i < bbb.length; i++,j++) {
		bbb[i] = String.valueOf(a.charAt(j));
	}
	for (int i = 0, j = aaa.length + bbb.length; i < ccc.length; i++,j++) {
		ccc[i] = String.valueOf(a.charAt(j));
	}
	for (int i = 0, j = aaa.length + bbb.length + ccc.length; i < ddd.length; i++,j++) {
		ddd[i] = String.valueOf(a.charAt(j));
	}
	for (int i = 0, j = aaa.length + bbb.length + ccc.length + ddd.length; i < eee.length; i++,j++) {
		eee[i] = String.valueOf(a.charAt(j));
	}
	System.out.print("Ciphertext: ");
	
	try {
	for (int i = 0; i < aaa.length; i++) {
		System.out.print(aaa[i]);
		System.out.print(bbb[i]);
		System.out.print(ccc[i]);
		System.out.print(ddd[i]);
		System.out.print(eee[i]);
	}
	}
	catch (Exception e) {
		
	}
	}
}
