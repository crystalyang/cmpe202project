import java.text.DecimalFormat;
import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static final String BASE_URI = "http://aws.nguyenresearch.com:8080/cart";
    static final DecimalFormat fmt = new DecimalFormat("0.00");

    public static double formatDouble(double d){
        return (double)Math.round(d*100)/100.;
    }

    public static void runTest(String[] args) throws Exception {
        ClientResource client=new ClientResource(BASE_URI);
        Representation result_string = client.get();

        try {
            JSONObject json = new JSONObject(result_string.getText());

            JSONArray items = json.getJSONArray("items");
            Component component=new ConcreteComponent();

            System.out.println("====================");
            System.out.println("INPUT:");
            System.out.println("");

            for(int i=0;i<items.length();i++){
                JSONObject obj=items.getJSONObject(i);
                String des=obj.getString("description").trim();
                if(des.contains("Imported")){
                    if(des.contains("Music")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new ImportedMusic(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));

                    }

                    if(des.contains("Book")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new ImportedMusic(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                    if(des.contains("Pills")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new ImportedMedical(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                    if(des.contains("Chocolate")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new ImportedChocolate(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                    if(des.contains("Perfume")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new ImportedPerfume(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                }else{

                    if(des.contains("Music")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new Music(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                    if(des.contains("Book")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new Books(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                    if(des.contains("Pills")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new Medical(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                    if(des.contains("Chocolate")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new Chocolate(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }

                    if(des.contains("Perfume")){
                        Item item = new Item();
                        int qty=obj.getInt("qty");
                        double price=obj.getDouble("price");
                        String description=obj.getString("description");
                        item.setQty(qty);
                        item.setDescription(description);
                        item.setPrice(price);
                        component=new Perfume(component,item);
                        System.out.println(qty+"|"+description+"|"+fmt.format(price));
                    }
                }

            }

            Double result = component.calculatePrice() ;
            component.printDescription();
            System.out.println("Sales Taxes:"+fmt.format(formatDouble(component.calculateTax())));
            System.out.println("Total:"+fmt.format(formatDouble(component.calculatePrice())));
        }
        catch (Exception e) {
            e.getMessage() ;
        }
    }
}
