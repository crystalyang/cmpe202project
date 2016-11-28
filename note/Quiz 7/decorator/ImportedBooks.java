 
import java.text.DecimalFormat;

public class ImportedBooks extends Decorator {
    private double price; //the price for 1
    private int quantity; 
    private String description;
    private double taxPrice; // the price for all the items including tax
    private double tax; //the tax for all the items
    private DecimalFormat fmt = new DecimalFormat("0.00");
    private double importTaxRate=0.05;
    private double basicTaxRate=0.00;

    public ImportedBooks( Component c, Item item )
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
        double result=beforePrice+taxPrice;
        return result;
    }

    public double addedPrice( ){
        double result=quantity*price+tax;
        return result;
    }

    public double calculateTax(){
        double beforeTax=super.calculateTax();
        double result=beforeTax+tax;
        return result;
    }

    public double addedTax(){
        double result=price*quantity*(importTaxRate+basicTaxRate);
        return result;
    }

    public void printDescription() 
    { 
        super.printDescription();
        System.out.println(description+": "+fmt.format(formatDouble(taxPrice)));
    }
    
    public double formatDouble(double d){
        return (double)Math.round(d*100)/100.0;
    }

}
