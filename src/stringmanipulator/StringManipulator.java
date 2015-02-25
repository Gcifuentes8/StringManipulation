package stringmanipulator;

/**
 *
 * @author 23125964
 */
public class StringManipulator {
    private static int stringSize;
    private static Object message;
    private static boolean letter;
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = "Chicago";
        stringSize = name.length();
              
        System.out.println(name + " has " + stringSize + 
                " characters.");
        
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        char letter = message.charAt(2);

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);

        
        
    }
    
}
