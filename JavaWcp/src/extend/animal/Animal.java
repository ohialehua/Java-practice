package extend.animal;

public class Animal {

	protected String name;

    public void eat() {
        System.out.println(name + "が食事をしました！");
    }

    public abstract void cry();
}
