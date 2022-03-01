package capsule.human;

public class HumanCapsule {

	private String name;
    private int age;

    public HumanCapsule(String name, int age) {
        this.name = name;
        this.age = age;
    }
 // getterメソッド
    public String getName() {
        return this.name;
    }
    /*
     public 戻り値の型(フィールドの型)  getフィールド名() {
        return this.フィールド名
    }
    */
 // setterメソッド
    public void setName(String name) {
        this.name = name;
    }
    /*
     public void setフィールド名(フィールドの型の引数) {
        this.フィールド名 = フィールドの型の引数;
     }
    */
 // getterメソッド
    public int getAge() {
        return this.age;
    }
}
