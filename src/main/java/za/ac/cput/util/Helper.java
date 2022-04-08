package za.ac.cput.util;

import java.util.UUID;

public class Helper {
    public static String generateId(){

        return UUID.randomUUID().toString();


        /*UUID idOne = UUID.randomUUID();
        String str = ""+idOne;
        int uid = str.hashCode();
        String filterStr = ""+uid;
        str= filterStr.replaceAll("-","");
        return Integer.parseInt(str);*/
    }
}


