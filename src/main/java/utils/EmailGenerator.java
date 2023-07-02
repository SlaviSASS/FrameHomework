package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public class EmailGenerator {

    private static String email;



    public static String generateRandomEmail() {
        if (email == null) {
            String uniqueId = RandomStringUtils.randomAlphabetic(5);
            email = "test" + uniqueId + "@example.com";
        }
        return email;
    }
    
}
