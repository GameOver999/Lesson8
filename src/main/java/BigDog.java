public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woow");
    }

    @Override
    void greets(Dog another) {
        System.out.println("WOOOOW");
    }
    void greets (BigDog another){
        System.out.println("Wooooooooooow");
    }
}
