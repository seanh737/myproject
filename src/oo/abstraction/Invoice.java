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
			System.out.print("請輸入發票號碼:");
			String number = scanner.nextLine();
			String s = number.substring(number.length()-3);
			
			if (s.equals(a1) || s.equals(a2) || s.equals(a3) || s.equals(a4)){
				System.out.println("您中獎了");
				System.out.println("是否要繼續兌?");
				System.out.println("1.是    2.否");				
				String r = scanner.nextLine();
				if (r.equals(b)){
					continue;
				}else{
					break;
				}
			}
			else{
				System.out.println("沒中獎");
				System.out.println("是否要繼續兌?");
				System.out.println("1.是    2.否");				
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
