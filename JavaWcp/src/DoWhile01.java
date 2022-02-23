
public class DoWhile01 {
	public static void main(String[] args) {
		int number = 1;
		do { //while文とは異なり、最低1度はブロックの処理が実行される
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number<50);
	}
}
