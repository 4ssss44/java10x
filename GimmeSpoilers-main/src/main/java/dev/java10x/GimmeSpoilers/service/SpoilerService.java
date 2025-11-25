package dev.java10x.GimmeSpoilers.service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dev.java10x.GimmeSpoilers.config.ApiConfig;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpoilerService {

    private final String API_KEY;
    private final String API_URL;

    @Autowired
    public SpoilerService(ApiConfig apiConfig) {
        this.API_KEY = apiConfig.getApiKey();
        this.API_URL = apiConfig.getApiUrl() + API_KEY;
    }

    public String getSpoiler(String item) throws Exception {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost request = new HttpPost(API_URL);
            request.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");

            JsonObject json = new JsonObject();
            JsonObject content = new JsonObject();
            content.addProperty("text", "Me dê um spoiler sobre " + item + " em 2 linhas");

            JsonObject contents = new JsonObject();
            contents.add("parts", new Gson().toJsonTree(new JsonObject[]{content}));
            json.add("contents", new Gson().toJsonTree(new JsonObject[]{contents}));

            request.setEntity(new StringEntity(json.toString()));

            return httpClient.execute(request, response -> {
                Gson gson = new Gson();
                JsonObject responseJson = gson.fromJson(new java.io.InputStreamReader(response.getEntity().getContent()), JsonObject.class);

                try {
                    JsonObject candidate = responseJson.getAsJsonArray("candidates").get(0).getAsJsonObject();
                    JsonObject contentPart = candidate.getAsJsonObject("content");
                    String spoiler = "";

                    if (contentPart.has("parts")) {
                        JsonArray parts = contentPart.getAsJsonArray("parts");
                        StringBuilder spoilerBuilder = new StringBuilder();
                        for (JsonElement part : parts) {
                            JsonObject partObject = part.getAsJsonObject();
                            if (partObject.has("text")) {
                                spoilerBuilder.append(partObject.get("text").getAsString());
                            }
                        }
                        spoiler = spoilerBuilder.toString();
                    } else if (contentPart.has("text")) {
                        spoiler = contentPart.get("text").getAsString();
                    } else {
                        spoiler = "Não foi possível encontrar o spoiler na resposta da API.";
                    }

                    return spoiler;

                } catch (Exception e) {
                    return "Erro ao processar a resposta da API: " + e.getMessage() + "Resposta completa: " + responseJson.toString();
                }
            });
        }
    }
}
