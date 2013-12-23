/**
 * Created by ranga_000 on 12/22/13.
 */
public class Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        int[] arr1 = {1, 2, 3, 4, 5};
        arr[0] = arr1;
        arr[1] = arr1;
        arr[2] = arr1;
        printArr(arr);
    }

    public static void printArr(int[][] arr) {
        for(int i = 0; i < arr.length;i++){

            int[] innerArr = arr[i];

            for(int j = 0; j < innerArr.length; j++){

                System.out.print(innerArr[j] + " ");
            }
            System.out.print("\n");
        }

    }
}
