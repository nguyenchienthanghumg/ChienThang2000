package Chuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class vd9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<>();
		list.add("Th�ng 1");
		list.add("Th�ng 2");
		list.add("Th�ng 3");
		list.add("Th�ng 4");
		list.add("Th�ng 5");
		list.add("Th�ng 6");
		list.add("Th�ng 7");
		list.add("Th�ng 8");
		list.add("Th�ng 9");
		list.add("Th�ng 10");
		list.add("Th�ng 11");
		list.add("Th�ng 12");
		
		System.out.println("Nhap vao chi so cua cac phan tu can lay:");
			int a = sc.nextInt();
			
		if ((a < 0) || (a > (list.size()-1))) {
			System.out.println("chi so can lon hon 0 va nho hon "+ (list.size()-1));
		}	else {
			String node = list.get(a);
			System.out.println("Phan tu co chi so = "+ a + " trong danh sach la "+node);
		}
		String firsnode = list.getFirst();
		
		String lastnode = list.getLast();
		System.out.println("Phan tu dau tien trong danh sach la "+ firsnode);
		System.out.println("Phan tu cuoi cung trong danh sach la "+ lastnode);
		sc.close();
	}
}