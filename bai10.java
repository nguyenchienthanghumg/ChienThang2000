package baitap;
import java.util.Scanner;
public class bai10 {

	public static void main(String[] args) {
		String chuoi;
		char kytu;
		int count=0;
		Scanner scanner=new Scanner(System.in);
		
		do {
			
			System.out.println("Nhap vao mot chuoi bat ky:");
			chuoi=scanner.nextLine();
		}while(chuoi.length()>80);
		System.out.println("Nhap vao ky tu can dem");
		kytu=scanner.next().charAt(0);
		
		for(int i=0;i<chuoi.length();i++)
		{
			if(kytu==chuoi.charAt(i))
				count ++;
		}

	    System.out.println("So lan xuat hien cua ky tu " + kytu +" trong chuoi " + chuoi + " = " + count);
	}
}