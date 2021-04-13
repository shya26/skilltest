public class String {
    public static void main(String[] args) {
        java.lang.String string = "The best of both worlds";
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < ((java.lang.String) string).length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }

    private char charAt(int i) {
        return 0;
    }
}
