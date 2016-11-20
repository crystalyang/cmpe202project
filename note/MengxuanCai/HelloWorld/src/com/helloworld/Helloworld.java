package com.helloworld;

import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feideng on 11/19/16.
 */
public class Helloworld {
    static final String BASE_URI = "http://aws.nguyenresearch.com:8080/cart";

    public static void main(String[] args) throws Exception {
        ClientResource client=new ClientResource(BASE_URI);
        Representation result_string = client.get();

        try {
            JSONObject json = new JSONObject(result_string.getText());

            JSONArray items = json.getJSONArray("items");
            List<Item> lib = new ArrayList<>();
            for (int i = 0; i < items.length(); i++) {
                Item item = new Item();
                JSONObject obj = items.getJSONObject(i);
                item.setQty(obj.getInt("qty"));
                item.setDescription(obj.getString("description"));
                item.setPrice(obj.getDouble("price"));
                lib.add(item);
            }
        }
        catch (Exception e) {
            e.getMessage() ;
        }
    }
}
