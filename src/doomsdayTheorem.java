//Author: Rangaraj Tirumala
//Date Created: 12/20/2013
//Date Updated: 12/20/2013

import java.util.Scanner;

public class doomsdayTheorem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int mon = 1;
        int tues = 2;
        int wed = 3;
        int thur = 4;
        int fri = 5;
        int sat = 6;
        int sun = 7;
        int divisor = 0;
        System.out.print("What year where you born? ");
        int year = reader.nextInt();
        int firstTwoDigits = year/100;
        int doomsdayFinder = firstTwoDigits%4;
        int doomsday = -1;
        switch(doomsdayFinder) {
            case 0:
                doomsday = 2;
                break;
            case 1:
                doomsday = 0;
                break;
            case 2:
                doomsday = 5;
                break;
            case 3:
                doomsday = 3;
                break;
        }
        int lastTwoDigits = year%100;
        int remainderOfTwelve = lastTwoDigits%12;
        int quotientOfTwelve = lastTwoDigits/12;
    }
}