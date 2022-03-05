package extend;

import extend.animal.Dog;

public class Abstract01 {

	public static void main(String[] args) {
		// Dogクラスのインスタンスを生成
        Dog dog = new Dog();
        dog.eat();
        dog.cry();
        // 抽象クラスはインスタンス生成するとコンパイルエラー
        // Animal animal = new Animal();
    }
}
