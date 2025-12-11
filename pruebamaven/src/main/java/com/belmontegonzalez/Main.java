package com.belmontegonzalez;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Belmonte", 21, "juanbelmonte@usal.es");

        Gson gson = new Gson();
        String json = gson.toJson(persona);
        System.out.println(json);
    }
}