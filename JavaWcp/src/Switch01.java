
public class Switch01 {
	public static void main(String[] args) {
		int val = 3;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("普通でした");
			break;
		default: // else的な。書かなくても大丈夫
			System.out.println("頑張ろう！");
		}
	}
}
