import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Steps steps = new Steps();

        String[][] arr = new String[11][11];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 3 || j == 7 || i == 3 || i == 7){
                    arr[i][j] = " * ";
                }else arr[i][j] = "   ";
            }
        }
        System.out.println("New XO table");

        steps.step1X(arr);
        steps.step2O(arr);

    }
}
