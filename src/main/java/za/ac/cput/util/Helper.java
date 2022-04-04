package za.ac.cput.util;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

    public static String generateID() {
        return UUID.randomUUID().toString();
    }

}

