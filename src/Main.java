import components.Button;
import components.Panel;
import components.Textbox;
import factories.*;


public class Main {
    public static void main(String[] args) {

        for (String configuration : Configuration.CONFIG_LIST) {
            GUIFactory guiFactory;
            switch (configuration) {
                case "Word90":
                    guiFactory = Word90Factory.getInstance();
                    break;
                case "Word00":
                    guiFactory = Word00Factory.getInstance();
                    break;
                case "Word10":
                    guiFactory = Word10Factory.getInstance();
                    break;
                case "Word21":
                    guiFactory = Word21Factory.getInstance();
                    break;
                default:
                    System.out.println("Wrong configuration: " + configuration);
                    continue;
            }
            Button button = guiFactory.createButton();
            Panel panel = guiFactory.createPanel();
            Textbox textbox = guiFactory.createTextbox();

            button.test();
            panel.test();
            textbox.test();
        }
    }
}
