package factories;

import components.Button;
import components.Panel;
import components.Textbox;

public class Word21Factory implements GUIFactory {

    private static Word21Factory INSTANCE;
    private static Word21Factory INSTANCE_1;

    private Word21Factory() {
    }

    public static Word21Factory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Word21Factory();
            return INSTANCE;
        } else if (INSTANCE_1 == null) {
            INSTANCE_1 = new Word21Factory();
            return INSTANCE_1;
        } else {
            System.out.println("Warning: 2 instances of Word21 already exist");
            // here i am returning the first instance as two instances are already created
            return INSTANCE;
        }
    }

    @Override
    public Panel createPanel() {
        return new Panel("Panel Word21");
    }

    @Override
    public Button createButton() {
        return new Button("Button Word21");
    }

    @Override
    public Textbox createTextbox() {
        return new Textbox("Textbox Word21");
    }
}
