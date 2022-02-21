
public class Variable01 {
	public static void main(String[] args) {
	//変数宣言
		// 定数の宣言
        final int MIN_NUMBER = 10;
        System.out.println(MIN_NUMBER);
		
        int num1; // int型の変数num1を宣言
        String str1; // String型の変数str1を宣言
        num1 = 10;
        str1 = "Hello World!";
        System.out.println(num1);
        System.out.println(str1);

        num1 = 20; // 再代入したら古い値は上書きされる
        System.out.println(num1);

        int num2 = 30; // int型の変数num2を宣言と同時に初期化
        System.out.println(num2);
    }
}
