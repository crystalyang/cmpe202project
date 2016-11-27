 
import java.text.DecimalFormat;

public class ImportedMedical extends Decorator {
    private double price; //the price for 1
    private int quantity; 
    private String description;
    private double taxPrice; // the price for all the items including tax
    private double tax; //the tax for all the items
    DecimalFormat fmt = new DecimalFormat("0.00");
    private double importTaxRate=0.05;
    private double basicTaxRate=0.00;

    public ImportedMedical( Component c, Item item )
    {

        super( c ) ;
        description=item.getDescription();
        price=item.getPrice();
        quantity=item.getQty();
        tax=addedTax();
        taxPrice=addedPrice();
    }

    public double calculatePrice()
    {
        double beforePrice=super.calculatePrice();
        return beforePrice+taxPrice;
    }

    public double addedPrice( ){
        return quantity*price+tax;
    }

    public double calculateTax(){
        double beforeTax=super.calculateTax();
        return beforeTax+tax;
    }

    public double addedTax(){
        return price*quantity*(importTaxRate+basicTaxRate);
    }

    public void printDescription() 
    { 
        super.printDescription();
        System.out.println(description+": "+fmt.format(taxPrice));
    }

}
