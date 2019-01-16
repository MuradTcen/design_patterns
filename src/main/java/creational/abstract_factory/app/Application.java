package creational.abstract_factory.app;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
