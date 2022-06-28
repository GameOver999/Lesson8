public class Cat extends Animal implements Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName()+ " says Meow");

    }

    @Override
    public void feed() {
        System.out.println("Feeding "+super.getName());

    }

    @Override
    public void walk() {
        System.out.println("Walking Cat "+super.getName());

    }

    @Override
    public void play() {
        System.out.println("Playing with Cat "+super.getName());

    }

}
