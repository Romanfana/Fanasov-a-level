public class task3 {
    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print("Оригинальный массив:\n");
        print_array(input);
        System.out.print("После перестановки:\n");
        transpose(input);
    }

    private static void transpose(int[][] input) {

        int[][] array = new int[input[0].length][input.length];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                array[j][i] = input[i][j];
            }
        }

        print_array(array);
    }
    private static void print_array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
