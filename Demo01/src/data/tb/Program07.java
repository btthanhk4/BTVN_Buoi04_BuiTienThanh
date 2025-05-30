package data.tb;

import java.util.ArrayList;
import java.util.Scanner;

public class Program07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Mảng không có phần tử");
            return;
        }

        int[] array = new int[n];

        // Nhập giá trị cho từng phần tử
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Tạo 2 danh sách để giữ thứ tự ban đầu
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        // Phân loại chẵn - lẻ
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenList.add(array[i]);
            } else {
                oddList.add(array[i]);
            }
        }

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp (chẵn trước, lẻ sau):");
        for (int i = 0; i < evenList.size(); i++) {
            System.out.print(evenList.get(i) + " ");
        }
        for (int i = 0; i < oddList.size(); i++) {
            System.out.print(oddList.get(i) + " ");
        }
    }
}
