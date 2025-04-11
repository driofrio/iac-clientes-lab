package com.ejemplo;

import static spark.Spark.*;

import java.sql.*;
import java.util.*;
import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        System.out.println("🚀 Iniciando aplicación...");

        int port = Integer.parseInt(System.getenv().getOrDefault("PORT", "8080"));
        port(port);
        ipAddress("0.0.0.0");

        System.out.println("🌐 Configurado para escuchar en el puerto: " + port);

        get("/clientes", (req, res) -> {
            System.out.println("💡 Se recibió petición en /clientes");
            return "{\"status\":\"ok\"}";
        });

        awaitInitialization();
        System.out.println("✅ Servidor inicializado correctamente.");
    }
}

