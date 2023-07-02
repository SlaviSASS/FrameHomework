package utils;
import java.util.UUID;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmailGenerator {

//
//        public static String generateRandomEmail() {
//            String prefix = RandomStringUtils.randomAlphabetic(7);
//            String sufix = RandomStringUtils.randomAlphabetic(5);
//            String domain = RandomStringUtils.randomAlphabetic(3);
//            return prefix + "@" + sufix + "." + domain;
//        }



        public static String generateRandomEmail() {
            String uniqueId = UUID.randomUUID().toString();
            return "test" + uniqueId + "@example.com";
        }

    }
