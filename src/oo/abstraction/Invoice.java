package oo.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		
		String i = "331";
//		------------0123456789
		String n = "1234567331";
//		System.out.println(n.length());
		String sub = n.substring(n.length()-3);
//		System.out.println(sub);
		
		
		ArrayList a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		String a1 = "331";
		String a2 = "821";
		String a3 = "886";
		String a4 = "554";
		String b = "1";
		
		
		while (true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("�п�J�o�����X:");
			String number = scanner.nextLine();
			String s = number.substring(number.length()-3);
			
			if (s.equals(a1) || s.equals(a2) || s.equals(a3) || s.equals(a4)){
				System.out.println("�z�����F");
				System.out.println("�O�_�n�~��I?");
				System.out.println("1.�O    2.�_");				
				String r = scanner.nextLine();
				if (r.equals(b)){
					continue;
				}else{
					break;
				}
			}
			else{
				System.out.println("�S����");
				System.out.println("�O�_�n�~��I?");
				System.out.println("1.�O    2.�_");				
				String r = scanner.nextLine();
				if (r.equals(b)){
					continue;
				}else{
					break;
				}
			}
			
			
			
			
		}
		
	}

}
