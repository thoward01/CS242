import java.util.*;

public class SuperSecureSecretSocks {
 
 public static String messStuffUp(String input) {
 
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
}