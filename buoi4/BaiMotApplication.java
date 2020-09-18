package baitapvenha;

import java.util.Scanner;

public class BaiMotApplication {
	public static void main(String[] args) {
		System.out.println("1: Giải phương trình bậc nhất");
		System.out.println("2: Giải phương trình bậc hai");
		Scanner scanner = new Scanner(System.in);
		int chosse = scanner.nextInt();
		if (chosse == 1) {
			giaiPhuongTrinhBacNhat();
		}
		if (chosse == 2) {
			giaiPhuongTrinhBacHai();
		}

	}

	private static void giaiPhuongTrinhBacHai() {
		System.out.println("Giải phương trình bậc hai ax2 + bx + c =0");
		Scanner scanner = new Scanner(System.in);
		System.out.println("a");
		int a = scanner.nextInt();
		System.out.println("b");
		int b = scanner.nextInt();
		System.out.println("c");
		int c = scanner.nextInt();
		if (a != 0) {
			double anfa = (b * b) - (4 * a * c);
			if (anfa > 0) {
				System.out.println("pt có 2 nghiệm");
				double x1 = ((-b) - Math.sqrt(anfa)) / (2 * a);
				double x2 = ((-b) + Math.sqrt(anfa)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			if (anfa == 0) {
				System.out.println("pt có nghiệm kép");
				double x = (-b) / (2 * a);
				System.out.println("x= " + x);
			}
			if (anfa < 0) {
				System.out.println("vô nghiệm");
			}

		} else {
			System.out.println(" số a phải khác 0");
		}

	}

	static void giaiPhuongTrinhBacNhat() {
		System.out.println("Giải phương trình bậc nhất ax + b = 0");
		System.out.println("a");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("b");
		int b = scanner.nextInt();
		if (a != 0) {
			int x = -b / a;
			System.out.println("nghiệm của phương trình  : " + x);
		} else {
			System.out.println(" số a phải khác 0");
		}
	}
}
