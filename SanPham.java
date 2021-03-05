package baitap;
import java.util.Scanner;

public class SanPham {
	 String tensp1;
	 String tensp2;
	public static void main(String[] args) {
		SanPham sp1=new SanPham();
		sp1.nhap();
		SanPham sp2=new SanPham();
		sp2.nhap();
		
		System.out.print("Xuat thong tin : ");
		sp1.xuat();
		sp2.xuat();
	class SPham {
	}
}
	private void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten sp1 : ");
		tensp1=sc.nextLine();
		System.out.print("\nNhap ten sp2 : ");
		tensp2=sc.nextLine();
		
	}
	private void xuat() {
		System.out.print("\nTem sp1 : " +tensp1);
		System.out.print("\nTen sp2 : " +tensp2);
	}

	
}