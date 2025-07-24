public class loops {
    public static void main (String [] args){
        int n = 4;
        char ch = 'A'; // Starting character
        for (int line = 1; line <= n; line++){
            for(int characterCount = 1; characterCount <= line; characterCount++){
                System.out.print(ch + " ");
                ch++; // Increment character for the next print
            }
            System.out.println();
        }
    }
}