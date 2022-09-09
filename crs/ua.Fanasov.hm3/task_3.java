import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word with a space:");
        String input = sc.nextLine();
        System.out.println(amont(input));
    }

        public static int amont(String text){
        int count = 0;


        if (text.length() != 0) {
            count++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("You entered " + count + " word");
            return count;
        }
}