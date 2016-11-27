

public class Decorator implements Component {

    private Component component;

    public Decorator( Component c )
    {
        component = c ;
    }

    public double calculatePrice()
    {
        return component.calculatePrice() ;
    }
    
    public double calculateTax()
    {
        return component.calculateTax() ;
    }
    
    public void printDescription()  {
        component.printDescription();
    }

}
