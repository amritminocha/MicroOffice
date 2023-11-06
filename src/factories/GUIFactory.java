package factories;

import components.Button;
import components.Panel;
import components.Textbox;

public interface GUIFactory {
    Panel createPanel();

    Button createButton();

    Textbox createTextbox();
}
