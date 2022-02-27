package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100÷0は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) {
			  //(例外クラス     変数名)
			System.out.println("例外が発生");
		} finally { //例外発生の有無にかかわらず必ず実行
			System.out.println("プログラムが終了");
		}
	}
}
