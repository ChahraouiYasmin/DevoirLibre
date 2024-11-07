package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {

    private static final ObjectMapper objectMapper = new ObjectMapper();


    public static String toJson(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }


    public static Client fromJsonToClient(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Client.class);
    }


    public static Compte fromJsonToCompte(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Compte.class);
    }


    public static Transaction fromJsonToTransaction(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Transaction.class);
    }
}

