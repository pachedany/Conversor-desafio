import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    Divisa buscaDivisa( String divisaPais, String divisaNew) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1fc80820c72b0163bc9c7536/pair/"+divisaPais+"/"+divisaNew);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        try{
            return  new Gson().fromJson(response.body(),Divisa.class);
        } catch (Exception e){
            throw new RuntimeException("Prueba otro dato");
        }
    }
}
