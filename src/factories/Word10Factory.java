package factories;

import components.Button;
import components.Panel;
import components.Textbox;

public class Word10Factory implements GUIFactory {

    private static Word10Factory INSTANCE;
    private static Word10Factory INSTANCE_1;

    private Word10Factory() {
    }

    public static Word10Factory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Word10Factory();
            return INSTANCE;
        } else if (INSTANCE_1 == null) {
            INSTANCE_1 = new Word10Factory();
            return INSTANCE_1;
        } else {
            System.out.println("Warning: 2 instances of Word10 already exist");
            // here i am returning the first instance as two instances are already created
            return INSTANCE;
        }
    }

    @Override
    public Panel createPanel() {
        return new Panel("Panel Word10");
    }

    @Override
    public Button createButton() {
        return new Button("Button Word10");
    }

    @Override
    public Textbox createTextbox() {
        return new Textbox("Textbox Word10");
    }
}
