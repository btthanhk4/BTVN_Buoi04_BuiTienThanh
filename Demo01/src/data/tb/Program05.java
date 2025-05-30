package data.tb;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean Odd = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                Odd = true;
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }

            }

        }
        if (Odd) {
            System.out.println("So nguyen duong lon nhat: " + max);
            System.out.println("So nguyen duong nho nhat: " + min);
        } else {
            System.out.println("Khong co phan tu le trong mang");
        }
    }
}
