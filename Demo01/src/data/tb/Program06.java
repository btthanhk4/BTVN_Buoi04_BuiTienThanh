package data.tb;

public class Program06 {
    public static void main(String[] args) {
        int[] originalArray = { 30, 20, 10, 40, 50, 10, 30, 30, 30, 20, 20, 10, 50, 20, 30, 10, 20};

        int[] markingArray = new int[1000];

        for (int i = 0; i < originalArray.length; i++) {
            int value = originalArray[i];
            markingArray[value]++;
        }

        int maxFrequency = 0;
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] > maxFrequency) {
                maxFrequency = markingArray[i];
            }
        }

        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == maxFrequency) {
                System.out.println("Phần tử: " + i + ", Số lần xuất hiện: " + maxFrequency);
            }
        }
    }
}
