/*
 * The program uses polymorphism.  The specific classes (Cat, Bird, Mouse, & Dog) inherit
 * the methods from Animal and override those methods that are appropriate for each animal.
 */

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());

        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Mouse m = new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.scurry());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.wagTail());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}