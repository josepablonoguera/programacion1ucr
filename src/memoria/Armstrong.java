/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memoria;

import java.util.Scanner;

public class Armstrong {

    static boolean isArmstrong(int n) { // 1 byte (boolean) + 4 bytes (int)  ===  21 bytes

        int temp, digits = 0, last = 0, sum = 0; // 16 bytes

        temp = n;

        while (temp > 0) {

            temp = temp / 10;

            digits++;

        }

        temp = n;

        while (temp > 0) {

            last = temp % 10;

            sum += (Math.pow(last, digits));

            temp = temp / 10;

        }

        if (n == sum) {

            return true;

        } else {

            return false;

        }

    }

    public static void main(String args[]) {

        int num; // 4 bytes

        Scanner sc = new Scanner(System.in);// 

        System.out.print("Enter the limit: "); // 17 * 2 bytes = 34 bytes

        num = sc.nextInt(); //

        System.out.println("Armstrong Number up to " + num + " are: ");//29 * 2 bytes = 58 bytes  

        for (int i = 0; i <= num; i++) { // 4 bytes 

            if (isArmstrong(i)) {           // 21 bytes * N

                System.out.print(i + ", "); // 2 * 2 bytes = 4 bytes * N

            }

        }

    }
    // Total = 100 bytes + 25 bytes( N ) 
    // si N = 1000
    // 25100 bytes / 1024 
    // 24.51 Kb
}
