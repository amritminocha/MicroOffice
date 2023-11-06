package components;

public class Button {
    private final String name;

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void test() {
        System.out.println(name);
    }

}
