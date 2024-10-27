/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */

package com.chalwk.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * A utility class for handling authentication token retrieval.
 */
public class Authentication {

    private static final String TOKEN_FILE = "auth.token"; // Token file path

    /**
     * Reads the authentication token from the "auth.token" file.
     *
     * @return the authentication token as a {@link String}
     * @throws IOException              if an I/O error occurs while reading the token
     * @throws IllegalArgumentException if the token is empty or null
     */
    public static String getToken() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(TOKEN_FILE))) {
            String token = reader.readLine();
            if (token == null || token.isEmpty()) {
                throw new IllegalArgumentException("The authentication token is empty.");
            }
            return token;
        } catch (IOException e) {
            System.err.println("Error reading the authentication token: " + e.getMessage());
            throw e; // Propagate the exception after logging
        }
    }
}
