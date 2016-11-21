/**
 * Write a description of class ButtonFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonFactory implements AbstractFactory 
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ButtonFactory
     */
    public ButtonFactory()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public FactoryPart getStart() {
        return new Start();
    }
    @Override
    public FactoryPart getChoose_i(){
        return new Choose_i();
    }
    @Override
    public FactoryPart getChoose_j(){
        return new Choose_j();
    }
    @Override
    public FactoryPart getSwap(){
        return new Swap();
    }
    @Override
    public FactoryPart getNext_Stage(){
        return new Next_Stage();
    }
    @Override
    public FactoryPart getReset(){
        return new Reset();
    }
    @Override
    public FactoryPart getTutorial(){
        return new Tutorial();
    }
}
