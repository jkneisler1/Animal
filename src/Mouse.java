/*
 * All Mice are Animals but all Animals are not Mice
 */
public class Mouse extends Animal {

    public Mouse() {
        super();
        System.out.println("Now I am a Mouse!");
    }

    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }

    public String scurry() {
        return "A mouse scurries about...";
    }
}
