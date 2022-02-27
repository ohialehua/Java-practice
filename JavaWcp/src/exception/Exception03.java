package exception;

public class Exception03 {

	public static void main(String[] args) {
		try {
			Exception03.division(100, 0);
		} catch (ArithmeticException e) { //算術計算でのエラー
			System.out.println("ArithmeticException例外が発生");
		} catch (IllegalArgumentException e) { //メソッドに不正な引数を渡すことによるエラー	
			System.out.println("IllegalArgumentException例外が発生");
			// 例外インスタンスをスロー
			throw e; //ここまで実行される
		}
		// finallyブロックでないので処理が実行されない
		System.out.println("プログラム修了");
	}

	public static void division(int a, int b) {
		System.out.println(a + " ÷ " + b + "は？");
		if (b == 0) {
			// 例外インスタンスを生成してスロー
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}
