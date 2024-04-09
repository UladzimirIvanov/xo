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
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        boolean win = false;
        String XO = "x";
        int UserNumber;

        while (win == false){
            XO = "x";
            System.out.println("Ход " + XO + ", укажите поле: ");
            UserNumber = scanner.nextInt();
            steps.step(arr, UserNumber, XO);

            XO = "o";
            System.out.println("Ход " + XO + ", укажите поле: ");
            UserNumber = scanner.nextInt();
            steps.step(arr, UserNumber, XO);
        }

    }
}
