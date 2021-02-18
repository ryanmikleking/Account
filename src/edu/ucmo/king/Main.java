/* Ryan M. King
* CS 1110
* HW3
* Description: Program inserts value of into a specific index within the array
 */
package edu.ucmo.king;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Variables
        int[] array = new int[10];
        int lastIndexTaken = 5;
        int num = 7;

        // initializes values for array
        array[0] = 2;
        array[1] = 4;
        array[2]= 6;
        array[3] = 8;
        array[4] = 10;
        array[5] = 12;


        // For loop that inputs a value at a specific index and shifts the contents of array
        for (int i = lastIndexTaken; i >= lastIndexTaken; i--) {
            array[i + 1] = array[i];
        }
        array[lastIndexTaken] = num;

        for(int i = 0; i < array.length; i++) System.out.println(array[i]); // Prints results
    }
}
