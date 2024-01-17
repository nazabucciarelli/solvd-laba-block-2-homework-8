package com.solvd.animals_mvc.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class JsonParser {
    public static <T> T parseJsonToObject(File jsonFile, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
            return objectMapper.readValue(jsonFile, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> void parseObjectToJson(File resultFile, T object) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(resultFile, object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
