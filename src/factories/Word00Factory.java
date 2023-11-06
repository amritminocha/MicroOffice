package factories;

import components.Button;
import components.Panel;
import components.Textbox;

public class Word00Factory implements GUIFactory {

    private static Word00Factory INSTANCE;
    private static Word00Factory INSTANCE_1;

    private Word00Factory() {
    }

    public static Word00Factory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Word00Factory();
            return INSTANCE;
        } else if (INSTANCE_1 == null) {
            INSTANCE_1 = new Word00Factory();
            return INSTANCE_1;
        } else {
            System.out.println("Warning: 2 instances of Word00 already exist");
            // here i am returning the first instance as two instances are already created
            return INSTANCE;
        }
    }
    
    @Override
    public Panel createPanel() {
        return new Panel("Panel Word00");
    }

    @Override
    public Button createButton() {
        return new Button("Button Word00");
    }

    @Override
    public Textbox createTextbox() {
        return new Textbox("Textbox Word00");
    }
}
