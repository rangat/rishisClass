/**
 * Write a description of class ArrayFiller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
public class ArrayFiller {
    public static void main(String [] args){
        Scanner reader = new Scanner (System.in);
        while(true){
            System.out.println("What matrix pattern do you want");
            System.out.println("1. 2 X 2 \n2. 4 X 4 \n3. 6 X 6 (Pairs)\n4. 6 X 6 (Quads)\n(any other number will exit)");
            int input = reader.nextInt();
            int[][] arr = new int[0][0];
            switch (input){
                case 1:
                    arr = twoByTwo();
                    break;
                case 2:
                    arr = fourByFour();
                    break;
                case 3:
                    arr = sixBySixPairs();
                    break;
                case 4:
                    arr = sixBySixQuads();
                    break;
                default:
                    break;
            }
            System.out.println(arr);
        }
    }

    public static int[][] twoByTwo() {
        int[][] arr = new int[2][2];
        return arr;
    }

    public static int[][] fourByFour() {
        int arr[][] = new int[4][4];
        return arr;

    }

    public static int[][] sixBySixPairs() {
        int arr [][] = new int[6][6];
        return arr;
    }

    public static int[][] sixBySixQuads() {
        int arr [][] = new int[6][6];
        return arr;
    }


}