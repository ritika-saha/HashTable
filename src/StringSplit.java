public class StringSplit {
    public static String[] splitText(String text){
        // Convert the input text to lowercase
        String resText = text.toLowerCase();
        
        // Split the lowercase text into an array of words
        return resText.split("\\s");                 
    }
    
}
