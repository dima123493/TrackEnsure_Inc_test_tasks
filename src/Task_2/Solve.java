package Task_2;

class RotateArrayToTheRight {

    public static void main(String[] args) {
        int[][] array = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};
        System.out.println("Before: ");
        print(array);
        Rotate90Degrees(array);
        System.out.println();
        System.out.println("After: ");
        print(array);
    }

    public static void reverseElementsRowWise(int[][] array) {
        int numbers = array.length;
        for(int i = 0; i < numbers; ++i) {
            for(int j = 0; j < numbers / 2; ++j) {
                int temp = array[i][numbers - j - 1];
                array[i][numbers - j - 1] = array[i][j];
                array[i][j] = temp;
            }
        }
    }

    public static void transpose(int[][] array) {
        int numbers = array.length;
        for(int i = 0; i < numbers; ++i) {
            for(int j = i + 1; j < numbers; ++j) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    public static void Rotate90Degrees(int[][] array) {
        transpose(array);
        reverseElementsRowWise(array);
    }

    public static void print(int[][] array) {
        int numbers = array.length;
        for(int i = 0; i < numbers; ++i) {
            for(int j = 0; j < numbers; ++j) {
                System.out.print(array[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

}