package com.ejemplo;

import static spark.Spark.*;

import java.sql.*;
import java.util.*;
import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        port(Integer.parseInt(System.getenv().getOrDefault("PORT", "8080")));

        get("/clientes", (req, res) -> {
    return "{\"status\":\"ok\"}";
});

        awaitInitialization();
    }
}
