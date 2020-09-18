package baitapvenha;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiBonApplication {
	public static void main(String[] args) {
		System.out.println("Viết chương trình in ra các số nguyên tố lớn hơn 0 và nhỏ hơn giá trị nhập vào o");
		Scanner scanner = new Scanner(System.in);
		System.out.println("vui lòng nhập số: ");
		int a = scanner.nextInt();
		if (a == 0) {
			System.out.println("đọc lại đầu bài!");

		}
		if (a == 1) {
			System.out.println("các số nguyên tố nhỏ hơn " + a + " là : ");
			System.out.println("1");
		} else {
			System.out.println("các số nguyên tố nhỏ hơn " + a + " là : ");
			for (int i = 0; i < a; i++) {
				if (kiemTraSNT(i)) {
					System.out.print(i + " ");
				} else {

				}
			}
		}

	}

	private static boolean kiemTraSNT(int n) {
		int canBacHai = (int) Math.sqrt(n);
		for (int i = 2; i <= canBacHai; i++) {
			if (n % i == 0) {

				return false;
			}
		}
		return true;
	}
}
