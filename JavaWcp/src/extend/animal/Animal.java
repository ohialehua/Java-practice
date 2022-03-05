package extend.animal;

//抽象クラスの宣言
public abstract class Animal {

	protected String name;

    public void eat() {
        System.out.println(name + "が食事をしました！");
    }
 // 抽象メソッドの宣言
 // サブクラスごとに違う処理は、抽象メソッドにしてサブクラスに実装させる
    public abstract void cry();
 // アクセス修飾子 abstract 戻り値の型 メソッド名(引数);
}
