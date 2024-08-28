/* Copyright (c) 2024 Jericho Crosby <jericho.crosby227@gmail.com>. Licensed under GNU General Public License v3.0.
   See the LICENSE file or visit https://www.gnu.org/licenses/gpl-3.0.en.html for details. */
package com.chalwk.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * A utility class for handling authentication token retrieval.
 */
public class authentication {

    /**
     * Reads the authentication token from the "auth.token" file.
     *
     * @return the authentication token as a {@link String}
     * @throws IOException if an I/O error occurs while reading the token
     */
    public static String getToken() throws IOException {
        try (BufferedReader text = new BufferedReader(new FileReader("auth.token"))) {
            return text.readLine();
        }
    }
}