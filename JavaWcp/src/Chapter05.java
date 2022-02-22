public class Chapter05 {
	public static void main(String[] args) {
		long long1 = 20000114L;
		double double1 = 2000.0114;
		boolean boolean1 = true;
		Float float1 = 1.14f;
		Integer integer1 = 114;
		Character character1 = 'あ';

		int[] array1 = new int[5];
		array1[0] = 20;
		array1[1] = 00;
		array1[2] = 12;
		array1[3] = 01;
		array1[4] = 14;
		int int1 = array1[3];

        /* 模範解答(配列を横並びで指定し、変数への格納も最小限)
        int[] array = { 0, 10, 20, 30, 40 };
        System.out.println(array[3]);
        */

		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);
		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);
		System.out.println(int1);
	}
}
