
public class Chapter07 {
	public static void main(String[] args) {
		int d = 12;
		if (d <= 5) {
			System.out.println("とても近いです");
		} else if (d <= 10) {
			System.out.println("近いです");
		} else if (d <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "red";
		switch (color) {
		case "blue":
			System.out.println("青信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		default:
			System.out.println("赤信号です");
		}
	}
}
