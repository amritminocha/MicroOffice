package factories;

import components.Button;
import components.Panel;
import components.Textbox;

public class Word90Factory implements GUIFactory {

    private static Word90Factory INSTANCE;
    private static Word90Factory INSTANCE_1;

    private Word90Factory() {
    }

    public static Word90Factory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Word90Factory();
            return INSTANCE;
        } else if (INSTANCE_1 == null) {
            INSTANCE_1 = new Word90Factory();
            return INSTANCE_1;
        } else {
            System.out.println("Warning: 2 instances of Word90 already exist");
            // here i am returning the first instance as two instances are already created
            return INSTANCE;
        }
    }

    @Override
    public Panel createPanel() {
        return new Panel("Panel Word90");
    }

    @Override
    public Button createButton() {
        return new Button("Button Word90");
    }

    @Override
    public Textbox createTextbox() {
        return new Textbox("Textbox Word90");
    }
}
