package baitapvenha;

import java.util.ArrayList;
import java.util.List;

public class BaiBaApplication {
	public static void main(String[] args) {
		ArrayList<Integer> listSo = new ArrayList<>();
		for (int i = 20; i <= 200; i++) {
			listSo.add(i);
		}
		System.out.println(listSo);
		kiemTra(listSo);
	}

	private static void kiemTra(ArrayList<Integer> listSo) {

		for (int i = 0; i < listSo.size(); i++) {
			double x = listSo.get(i) / 7;
			if (x == 0) {
				for (int j = 0; j < i; j++) {
					double y = listSo.get(i) / 5;
					if (y == 0) {
						System.out.println(listSo.get(i));
					}
				}
			}
		}

	}

}
