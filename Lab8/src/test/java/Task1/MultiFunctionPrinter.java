package Task1;

import java.util.Scanner;
public class MultiFunctionPrinter implements MultiFunctionPrintable{
    @Override
    public void print(Document document)
    {
        System.out.println(document.getText());
    }
    @Override
    public Document scan(){
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        Document document = new Document(value);
        return document;
    }
    @Override
    public void fax(Document document){
        System.out.println(document.getText()+"\nThis was faxed");
    }
}
