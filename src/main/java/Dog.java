public class Dog extends Animal implements Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName()+" Says Woof");

    }
    void greets(Dog another){
        System.out.println("Woof ");

    }

    @Override
    public void feed() {
        System.out.println("Feeding Dog "+super.getName());

    }

    @Override
    public void walk() {
        System.out.println("Walking Dog "+super.getName());

    }

    @Override
    public void play() {
        System.out.println("Playing with Dog "+super.getName());

    }
}
