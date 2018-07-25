package lab1_decrypting;

import java.util.Scanner;

public class Decrypt {
	String a;
	int b,c,d;
	Scanner reader = new Scanner(System.in);
	String[] aaa;
	String[] bbb;
	String[] ccc;
	String[] ddd;
	String[] eee;
	
	

	public void decryption(){
		System.out.println("Please enter the ciphertext (without space): ");
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

	for (int i = 0, j = 0; j < aaa.length; i = i + 5, j++) {
		aaa[j] = String.valueOf(a.charAt(i));
	}
	for (int i = 1, j = 0; j < bbb.length; i = i + 5, j++) {
		bbb[j] = String.valueOf(a.charAt(i));
	}
	for (int i = 2, j = 0; j < ccc.length; i = i + 5, j++) {
		ccc[j] = String.valueOf(a.charAt(i));
	}
	for (int i = 3, j = 0; j < ddd.length; i = i + 5, j++) {
		ddd[j] = String.valueOf(a.charAt(i));
	}
	for (int i = 4, j = 0; j < eee.length; i = i + 5, j++) {
		eee[j] = String.valueOf(a.charAt(i));
	}
	
	System.out.print("Plaintext: ");
	try {
	for (int i = 0; i < aaa.length; i++) {
		System.out.print(aaa[i]);
	}
	for (int i = 0; i < bbb.length; i++) {
		System.out.print(bbb[i]);
	}
	for (int i = 0; i < ccc.length; i++) {
		System.out.print(ccc[i]);
	}
	for (int i = 0; i < ddd.length; i++) {
		System.out.print(ddd[i]);
	}
	for (int i = 0; i < eee.length; i++) {
		System.out.print(eee[i]);
	}
	}
	catch (Exception e) {
		
	}
	}
}