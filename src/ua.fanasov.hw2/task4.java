public class task4 {
    public static void main(String[] args) {

        int a = 53;
        int b = 63;
        int c = 52;
        System.out.println(min(a, b, c));
    }

    public static int min(int a, int b, int c) {
        int x = 0;
        if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
            System.out.println(Math.abs(a));
        } else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
            System.out.println(Math.abs(b));
        } else {
            System.out.println(Math.abs(c));
        }
        return x;
    }

}
