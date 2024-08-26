package br.com.desafiosicredi.tests.products.payloads;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.json.JSONObject;

@JsonDeserialize
public class ProductsPayloads {




    public static JSONObject payloadAddProdutos(){
        JSONObject payload = new JSONObject();

        payload.put("title", "Camiseta Futebol");
        payload.put("description", "10% desconto cartão loja");
        payload.put("price",13);
        payload.put("discountPercentage", 8.4);
        payload.put("rating", 4.26);
        payload.put("stock", 65);
        payload.put("brand", " teste Filipe");
        payload.put("category", "vestuário");
        payload.put("thumbnail", "https://i.dummyjson.com/data/products/11/thumnail.jpg");

        return payload;
    }


}
