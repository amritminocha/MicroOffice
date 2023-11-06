package components;

public class Textbox {
    private final String name;

    public Textbox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void test() {
        System.out.println(name);
    }
}
