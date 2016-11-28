 
import java.util.ArrayList;

public class ConcreteComponent implements Component {
    private String description ;
    private int quantity;
    private double price;

    public ConcreteComponent(){
        price=new Double(0.00);
        quantity=0;
        description="";
    }

    public double calculatePrice() {
        return new Double(0.00);
    }

    public double calculateTax(){
        return new Double(0.00);
    }

    public void printDescription() {
        System.out.println("");
        System.out.println("OUTPUT:" );
        System.out.println("");
    }

}
