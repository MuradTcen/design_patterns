package creational.factory;

import creational.factory.dialogs.Dialog;
import creational.factory.dialogs.HtmlDiaolog;
import creational.factory.dialogs.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        }
        else {
            dialog = new HtmlDiaolog();
        }
    }


    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
