import java.util.Scanner;

public class TransposeHT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число M:");
        int M = scan.nextInt();
        System.out.println("Введіть число N:");
        int N = scan.nextInt();
        Integer[][] Arr = new Integer[M][N];
        Integer[][] Arr1 = new Integer[N][M];

        System.out.println("Матриця MxN: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] = j + 1;
                System.out.printf("%4d", Arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j =0; j <Arr1[i].length ; j++) {
                Arr1[i][j]=Arr[j][i];
            }

        }
        System.out.println("Матриця NxM: ");
        for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1[i].length; j++) {
                System.out.printf("%4d", Arr1[i][j]);
            }
            System.out.println();
        }


    }

}
