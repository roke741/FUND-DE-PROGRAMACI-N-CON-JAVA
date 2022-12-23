
package com.factug.factugo.pruebas;

import com.factug.factugo.entidades.Cliente;
import com.factug.factugo.entidades.Result;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.io.IOException;
import okhttp3.*;

/**
 *
 * @author Jhordie
 */

public class PruebaApiRest {
    
    public static void main(String[] args) throws IOException {
        
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "codigo=72784658");
        Request request = new Request.Builder()
            .url("https://fullcomputercenter.com/sunatphp/search_identity.php")
            .method("POST", body)
            .addHeader("Content-Type", "application/x-www-form-urlencoded")
            .addHeader("Origin", "https://www.fullcomputercenter.com")
            .build();
        Response response = client.newCall(request).execute();
        ResponseBody rpta = response.body();
        //Clientes cliente = new Clientes();
        //cliente.setDni(rpta.source());
        
        String json = rpta.string();
        System.out.println(json);
        //JsonArray array = new JsonArray(json);
        Gson gson = new Gson();
        Root obj = new Gson().fromJson(json, Root.class );
        
        System.out.println(obj.result.getNombre());
        System.out.println("Nombre: " + gson.toJson(json));
        String data = "Nombre: " + gson.toJson(json);
        System.out.println(data);
        System.out.println();
        
        
        
        
        //Gson g = new Gson();  
        //String str = g.toJson(json);  
        //System.out.println(str);
     
        //Cliente clt = new Gson().fromJson(json, Cliente.class );
         // accede a los valores del objeto
        //String nombre = clt.getNombre();
    }

    
    public class Root{
        public boolean success;
        public Result result;
    }

}
