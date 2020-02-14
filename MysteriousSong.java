import java.util.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

/**
 * Base64Decode
 */
public class MysteriousSong 
{
    public static String messStuffUp(String input) 
    {
    
    int numberOfCores = Runtime.getRuntime().availableProcessors();
    Integer[] ascii = new Integer[input.length()];
    
    for(int i = 0; i < input.length(); i++) {
       ascii[i] = (int)input.charAt(i);
    }
    
    for(int i = 0; i < input.length(); i++) {
       ascii[i] = ascii[i] - numberOfCores * 2;
    }
    
    String asciiString = "";
    for(int i = 0; i < input.length(); i++) {
       asciiString += ascii[i].toString(); 
    } 
    
    String base64encoded = Base64.getEncoder().withoutPadding().encodeToString(asciiString.getBytes());
    
    return base64encoded;
   }

   private static String B64toASCII(String input) 
   {
       int numberOfCores = Runtime.getRuntime().availableProcessors();
       Integer[] ascii = new Integer[input.length()];

       for (int i = 0; i < input.length(); i++) 
       {
           ascii[i] = (int)input.charAt(i);
       }

       for(int i = 0; i < input.length(); i++) 
       {
        ascii[i] = ascii[i] - numberOfCores * 2;
       }
       
       String asciiString = "";
       for(int i = 0; i < input.length(); i++) 
       {
          asciiString += ascii[i].toString(); 
       }
        return null;
       
   }

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

        //System.out.println(base64Decode(code));

        code = base64Decode(code);

        System.out.println(code);

        //split by two
        //add and subtract by 32 (for spaces)
        //
        
    }
    
}   
