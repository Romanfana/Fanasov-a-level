public class task3 {
    public static void main(String[] args) {
        int num = 424235;
        System.out.println(number(num));
    }

    public static int number(int num) {
        if ((num % 2) == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }


        return num;
    }
}
