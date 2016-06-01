package javaprob.prob7;

public class Sort {
    public static void main(String[] arg) {
        int array[] = {5, 9, 3, 8, 60, 20, 1};
        int temp = 0;
        int count = array.length;
        
        System.out.println("Before sort.");
        
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        
        // 버블정렬 (내림차순)이 적용된 코드를 여기에 작성합니다.
        // -> 메서드로 작성했습니다.

        if (BubbleSort(array) == false) {
            System.out.println("Bubble sort failure");
            return;
        }
        
        System.out.println("\nAfter sort.");
        
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static Boolean BubbleSort(int arr[]) {
        if (arr == null) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return true;
    }
}
