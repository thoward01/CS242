import java.util.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

/**
 * Base64Decode
 */
public class MysteriousSong 
{
    private static String base64Decode(String input)
    { 
        try 
        {
            byte[] decodedString = Base64.getDecoder().decode(input);
            return new String(decodedString, StandardCharsets.UTF_8.toString());
        } 
        catch (UnsupportedEncodingException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) 
    {
        String code = "NTc3OTg1MDg0NzI3OTg1NzE3Mjg0MDg5Nzk4NTA2NTgyNjkwNjg3OTc4NjkzMTA1MjcyNjkwNzA4NTc4MDcyNjU4MzA3NDg1ODM4NDA2NjY5NzE4NTc4MTQwMzg3OTc2NzY3OTg3MDg0NzI2OTA3NjczNzg3NTA4NzczODQ3MjA2NTA4MzczODAwNzk3MDA4OTc5ODU4MjA2ODgyNzM3ODc1MjYwNzI4NDg0ODA4MzI2MTUxNTg2NzA3OTgyNjgxNDc3NjkxNTE4MTcyNDIwMTY2NzE3NjUxOTY5MTk2ODY2MjIyNTY5MTYxNzIwMjAyMTY3MjQyMzI0MTg2NTI1MjU3MDI1NjY";

        System.out.println(base64Decode(code));
        
    }

}
