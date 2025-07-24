public class loops {
    public static void main (String [] args){
        int n = 4;
        for (int line = 1; line <= n; line++){
            for(int number = 1; number <= line; number++){
                System.out.print(number + " "); // Added a space for better readability
            }
            System.out.println();
        }
    }
}