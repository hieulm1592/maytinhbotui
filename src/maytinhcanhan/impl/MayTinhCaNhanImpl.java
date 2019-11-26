package maytinhcanhan.impl;

import maytinhcanhan.MayTinhCaNhan;

public class MayTinhCaNhanImpl implements MayTinhCaNhan {
	public Integer cong2So(int number1, int number2) {
		return number1 + number2;
	}

	public Integer tru2So(int number1, int number2) {
		return number1 - number2;
	}

	public Integer nhan2So(int number2, int number1) {
		return number1 * number2;
	}

	public Object chia2SoPhandu(int number1, int number2) {
		Object result = null;
		if (number2 == 0) {
			System.out.println("Bạn nhập sai rồi, mẫu không thể âm");
		} else {
			result = (float) number1 / number2;
		}
		return result;
	}

	public Integer chia2So(int number1, int number2) {
		Integer c = null;
		if (number2 == 0) {
			System.out.println("Bạn nhập sai rồi, mẫu không thể bằng âm");
		} else {
			c = (Integer) number1 / number2;
		}
		return c;
	}

	public Integer soDu2So(int number1, int number2) {
		return number1 % number2;
	}
}
