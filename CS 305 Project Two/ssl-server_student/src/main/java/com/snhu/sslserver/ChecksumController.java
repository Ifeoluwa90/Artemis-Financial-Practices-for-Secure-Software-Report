package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChecksumController {

    @GetMapping("/hash")
    public String getChecksum() {
        // Create a unique data string with your name
        String data = "Hello World Check Sum! - Ifeoluwa Adewoyin";
        
        try {
            // Use SHA-256 for the hash algorithm
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
            
            return "<h1>SSL Checksum</h1>"
                   + "<p><b>Data:</b> " + data + "</p>"
                   + "<p><b>SHA-256 Checksum:</b> " + bytesToHex(encodedHash) + "</p>";
        } catch (NoSuchAlgorithmException e) {
            return "Error generating checksum: " + e.getMessage();
        }
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
