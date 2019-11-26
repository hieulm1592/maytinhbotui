package maytinhcanhan.test;

import java.util.Scanner;

import maytinhcanhan.impl.MayTinhCaNhanImpl;

public class MayTinhCaNhanTest {
	
	private static Integer number1;
	private static Integer number2;
	private static String chon;

	public static void caseToanTu() {
		MayTinhCaNhanImpl mayTinhCaNhan = new MayTinhCaNhanImpl();
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("1. Mời bạn nhập toán tử +, -, *, /(không lấy phần thập phân), f (Lấy phần thập phân), % : ");
		System.out.println("2. Mời bạn thoát e: ");
		System.out.print("Mời bạn nhập: ");
		try {
			chon = scanner.next();
			if (chon.equals("+") || chon.equals("-") || chon.equals("*") || chon.equals("/") || chon.equals("%")
					|| chon.equals("f")) {

				System.out.print("Mời bạn nhập số thứ 1: ");
				number1 = scanner.nextInt();
				System.out.print("Mời bạn nhập số thứ 2: ");
				number2 = scanner.nextInt();

			}
		} catch (Exception e) {

		}
		switch (chon) {
		case "+":
			System.out.println("result = " + mayTinhCaNhan.cong2So(number1, number2));
			break;
		case "-":
			System.out.println("result = " + mayTinhCaNhan.tru2So(number1, number2));
			break;
		case "*":
			System.out.println("result = " + mayTinhCaNhan.nhan2So(number2, number1));
			break;
		case "/":
			System.out.println("result = " + mayTinhCaNhan.chia2So(number1, number2));
			break;
		case "f":
			System.out.println("result = " + mayTinhCaNhan.chia2SoPhandu(number1, number2));
			break;
		case "%":
			System.out.println("result = " + mayTinhCaNhan.soDu2So(number1, number2));
			break;
		case "e":
			System.out.println("Cảm ơn đã dùng chương trình");
			System.exit(0);
		default:
			System.out.println("Bạn nhập sai nhập lại đúng toán tử.");
			break;
		}
	}

	public static void main(String[] args) {
		while (true) {
			caseToanTu();
		}
	}

}
