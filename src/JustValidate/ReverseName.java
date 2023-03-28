package JustValidate;

import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the name: " );
		String name = scan.nextLine();
		String[] v = name.split(" ");
		String l = v[1].toString();
		String f = v[0].toString();
		StringBuffer buffer = new StringBuffer(f);
		StringBuffer buffers = new StringBuffer(l);
		buffer.reverse();
		buffers.reverse();
		System.out.println(buffer+" "+buffers);
//		char[] ch = name.toCharArray();
//		for (int i = name.length()-1; i >= 0; i--) {
//			
//			System.out.print(ch[i]);
//		}
	}
	
}