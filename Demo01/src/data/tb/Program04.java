package data.tb;

import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Mang rong");
        }
        else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n/2; i++) {
                int temp = arr[i];
                arr[i] = arr[n-1-i];
                arr[n-1-i] = temp;
            }
            System.out.println("Mang sau khi dao: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
