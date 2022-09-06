public class practise_less {
    public static void main(String[] args){
        System.out.println( degree(2,3));
    }
    public static int degree(int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }


}





