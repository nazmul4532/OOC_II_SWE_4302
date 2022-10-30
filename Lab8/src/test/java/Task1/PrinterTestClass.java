package Task1;

public class PrinterTestClass {
    public static void main(String[] args) {

        BasicPrinter test = new BasicPrinter();
        Document document = new Document("dummy basicPrinter text");
        test.print(document);
        document.setText("dummy multiFunctionPrinter text");
        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(document);
        multiFunctionPrinter.fax(multiFunctionPrinter.scan());
    }


}
