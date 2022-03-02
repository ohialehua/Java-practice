package extend.human;

public class Student extends Human {

	private int score;

    public Student(String name, int age, int score) {
      //スーパークラスのコンストラクタを呼び出し
        super(name, age);
      //引数があるコンストラクタを呼び出すにはsuperを使って明示的に記述する
        this.score = score;
    }

    public String getStudentProfile() {
        String profile = "年齢は" + super.age + "です。";
        profile += "学生で、テストの点数は" + this.score + "点です。";
        return profile;
    }
}
