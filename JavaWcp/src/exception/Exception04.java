package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {

	public static void main(String[] args) {
		try {
			Exception04.readFile("exception.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException例外が発生");
		}
		// catch文で例外処理されるので、処理が実行される
		System.out.println("プログラム修了");
	}

	public static void readFile(String fileName) throws FileNotFoundException {
	//修飾子 戻り値の型 メソッド名(引数)         throws 例外クラスの型(カンマ（,）区切りで複数指定可)
		System.out.println("ファイルの読み込み開始");
		FileReader fr = new FileReader(fileName); //ここまで実行される
		         //今回は使わない変数
		System.out.println(fileName + "の読み込み完了");
	}
}
