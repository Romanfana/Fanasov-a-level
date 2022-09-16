import java.util.Arrays;

public class task2 {
    public static void main(String[] args){

        int[] a = {1,2,4,3,5};
        int[] b = {1,2,3,4,5};

        System.out.println("isSorted:");
        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
    }


    public static boolean isSorted(int[] a) {

        int[] newA = Arrays.copyOf(a, a.length);
        Arrays.sort(newA);

        for(int i=0; i<a.length; ++i) {
            if(a[i] != newA[i]) {
                return false;
            }
        }

        return true;
    }
}
