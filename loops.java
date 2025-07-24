public class loops {
    public static void main (String [] args){
        int n = 4;
        for (int line = 1; line <= n; line++){
            // Print spaces
            for (int space = 1; space < line; space++){
                System.out.print(" ");
            }
            // Print stars
            for(int star = 1; star <= (n - line + 1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}