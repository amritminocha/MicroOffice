package components;

public class Panel {
    private final String name;

    public Panel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void test() {
        System.out.println(name);
    }
}
