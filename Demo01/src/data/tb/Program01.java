package data.tb;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        //int[] arr = {10, 20, 5, 50, 30};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
