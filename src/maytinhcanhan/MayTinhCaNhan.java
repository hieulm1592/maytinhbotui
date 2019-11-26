package maytinhcanhan;

public interface MayTinhCaNhan {
	// Giả định làm 1 máy tính công trừ nhân chia % ... trên 2 số bất kỳ.
	// 1. Cộng 2 số
	Integer cong2So(int number1, int number2);
	// 2. Trừ 2 số
	Integer tru2So(int number1, int number2);
	// 3. Nhân 2 số
	Integer nhan2So(int number1, int number2);
	// 4. Chia 2 số
	Integer chia2So(int number1, int number2);
	// 5. Chia 2 số có phần dư
	Object chia2SoPhandu(int number1, int number2);
	// 6. Số dư của 2 số
	Integer soDu2So(int number1, int number2);
}
