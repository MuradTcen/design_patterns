package creational.factory.dialogs;

import creational.factory.buttons.Button;
import creational.factory.buttons.HtmlButton;

public class HtmlDiaolog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
