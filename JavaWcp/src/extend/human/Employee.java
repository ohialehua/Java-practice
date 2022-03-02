package extend.human;

public class Employee extends Human {

	private String department;

    public Employee(String name, int age, String department) {
      //スーパークラスのコンストラクタを呼び出し
        super(name, age);
      //引数があるコンストラクタを呼び出すにはsuperを使って明示的に記述する
        this.department = department;
    }

    public String getEmployeeProfile() {
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }
}
