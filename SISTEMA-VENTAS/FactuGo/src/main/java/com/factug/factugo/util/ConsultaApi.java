
package com.factug.factugo.util;

import com.factug.factugo.entidades.Result;
import com.factug.factugo.pruebas.PruebaApiRest;
import com.google.gson.Gson;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 *
 * @author Jhordie
 */
public class ConsultaApi {
    private static String url = "https://fullcomputercenter.com/sunatphp/search_identity.php";
    
    public static ConsultaApi ConsultaApidni(String dni) throws IOException{
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "codigo="+dni);
        Request request = new Request.Builder()
            .url(ConsultaApi.url)
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
        //PruebaApiRest.Root obj = new Gson().fromJson(json, PruebaApiRest.Root.class );
        Root obj = new Gson().fromJson(json, Root.class );
        System.out.println(obj.result.getNombre());
        //System.out.println("Nombre: " + gson.toJson(json));
        //String data = "Nombre: " + gson.toJson(json);
        Util.NOMBRECLIENTE = obj.result.getNombre();
        Util.APELLIDOSCLIENTE = obj.result.getPaterno() +" "+ obj.result.materno;
        
        //System.out.println(data);
        //Gson g = new Gson();  
        //String str = g.toJson(json);  
        //System.out.println(str);
     
        //Cliente clt = new Gson().fromJson(json, Cliente.class );
         // accede a los valores del objeto
        //String nombre = clt.getNombre();
        return null;
    }
    public class Root{
        public boolean success;
        public Result result;
    }
}
