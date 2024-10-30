package com.mycompany.app;

import org.junit.jupiter.api.Test; // Import para JUnit 5
import static org.junit.jupiter.api.Assertions.*; // Import correcto para JUnit 5

public class AuthenticatorTest {
    private Authenticator auth = new Authenticator();

    @Test
    public void testValidCredentials() {
        assertTrue(auth.authenticate("juanp", "password123"));
    }

    @Test
    public void testInvalidCredentials() {
        assertFalse(auth.authenticate("juanp", "wrongpassword"));
    }

    @Test
    public void testEmptyCredentials() {
        assertFalse(auth.authenticate("", ""));
    }
}
