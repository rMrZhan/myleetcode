package common;

import java.util.Scanner;

public class Utils {
    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
}
