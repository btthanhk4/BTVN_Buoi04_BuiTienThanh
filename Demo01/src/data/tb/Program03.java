package data.tb;

import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        //khai bao mang n phan tu
        int[] arr = new int[n];

        //nhap mang
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cout = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                cout += 1;
            }
        }
        System.out.println("So phan tu chan cua mang: " + cout);
    }
}
