package com.mycompany.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authenticator auth = new Authenticator();

        System.out.print("Ingrese nombre de usuario: ");
        String username = scanner.nextLine();

        System.out.print("Ingrese contraseña: ");
        String password = scanner.nextLine();

        if (auth.authenticate(username, password)) {
            System.out.println("Autenticación exitosa");
        } else {
            System.out.println("Credenciales incorrectas");
        }

        scanner.close();
    }
}
