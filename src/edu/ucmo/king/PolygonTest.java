/* Ryan M. King
* CS 1110
* HW3
* Description: Runs program for RegularPolygon object
 */
package edu.ucmo.king;

public class PolygonTest {
    public static void main(String[] args) {
        // Runs and tests the edu.ucmo.king.PolygonTest.RegularPolygon object

        RegularPolygon p1 = new RegularPolygon(); // Creates new object w/o arg

        RegularPolygon p2 = new RegularPolygon(6, 4); // Creates new object with two args

        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8); // Creates new object with 4 args

        System.out.println("The perimeter is: " + p1.getPerimeter() + "\n The area is: " + p1.getArea()); // Prints perimeter and area for p1
        System.out.println("");

        System.out.println("The perimeter is: " + p2.getPerimeter() + "\n The area is: " + p2.getArea()); // Prints perimeter and area for p2
        System.out.println("");

        System.out.println("The perimeter is: " + p3.getPerimeter() + "\n The area is: " + p3.getArea()); // Prints perimeter and area for p3
        System.out.println("");

    }

}
