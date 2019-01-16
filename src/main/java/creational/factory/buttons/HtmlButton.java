package creational.factory.buttons;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button> Test button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
