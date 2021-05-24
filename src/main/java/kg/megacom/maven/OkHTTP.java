package kg.megacom.maven;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.maven.models.Products;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.URL;

public class OkHTTP {
    public static void main(String[] args) throws IOException {
        // ----Jackson-begin---- // ----OkHTTP-begin----
        ObjectMapper objectMapper = new ObjectMapper();
        URL url = new URL("https://www.7timer.info/bin/astro.php?lon=74.59&lat=42.88&ac=0&unit=metric&output=json&tzshift=0");
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String json = response.body().string();
        Products obj = objectMapper.readValue(json, Products.class);
        System.out.println(obj);
    }
}
