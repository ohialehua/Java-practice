
public class Chapter06 {
	public static void main(String[] args) {
		int val = 2 + 5;
		System.out.println(val);
		val++;
		System.out.println(val);
		val *= 5;
		System.out.println(val);

		boolean bool = val == 50;
		System.out.println(bool);

		bool = val < 50 && val % 10 == 0;
		System.out.println(bool);
		
	  //インクリメントの順序による違い
		val = 3;
		int a = ++val; //valにインクリメントされてからaに代入される
		System.out.println(a);
		System.out.println(val);
		
		val = 3;
		int b = val++; //valがbに代入されてからインクリメントされるためbの値は3
		System.out.println(b);
		System.out.println(val);
	}
}
