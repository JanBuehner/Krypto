public class Skytale
{
    public Skytale()
    {
        
    }
    
    public static String encode(String message, int rows) {
        String output = "";
        for (int i = 0; i < rows; i++) {
            int index = i;
            while (index < message.length()) {
                output += message.charAt(index);
                index += rows;
            }
        }
        return output;
    }
    
    public static String decode(String message, int rows) {
        char[] messageCharArray = message.toCharArray();
        char[] output = new char[message.length()];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for(int j = i; j < messageCharArray.length; j+=rows) {
                output[j] = messageCharArray[index];
                index += 1;
            }
        }
        return new String(output);
    }
    
    public static void bruteForce(String message) {
        for(int i = 0; i < message.length(); i++) {
            System.out.println(" === ROWS: " + i + " ===" );
            System.out.println(Skytale.decode(message, i));
            
        }
    }
}
