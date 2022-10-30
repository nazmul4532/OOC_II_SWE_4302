package Task1;

public class BasicPrinter implements Printable {
    @Override
    public void print(Document document)
    {
        System.out.println(document.getText());
    }
}
