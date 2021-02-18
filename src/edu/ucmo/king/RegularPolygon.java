/* Ryan M. King
* CS 1110
* HW3
* Description: Creates an object RegularPolygon with methods to get and set each property. The program
*  determines the perimeter and area for polygon.
*/
package edu.ucmo.king;

public class RegularPolygon {

    // Variables
    private int n;
    private double side;
    private double x;
    private double y;

    // No arg constructor for polygon
    RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    // Two arg constructor
    RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = 0;
        y = 0;
    }

    // Four arg constructor
    RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    public int getN() {
        return n;
    } // method that gets number of sides

    public void setN(int newN) {
        n = newN;
    } // method that sets number of sides

    public double getSide() {
        return side;
    } // method that gets side lengths

    public void setSide(double newSide) {
        side = newSide;
    } // method that sets side lengths

    public double getX() {
        return x;
    } // method that gets x-coordinate

    public void setX(double newX) {
        x = newX;
    } // method that sets x-coordinate

    public double getY() {
        return y;
    } // method that gets y-coordinate

    public void setY(double newY) {
        y = newY;
    } // method that sets y-coordinate

    public double getPerimeter() {
        return n * side;
    } // method determines perimeter for polygon

    // method determines area for polygon
    public double getArea() {
        return (n * side * side) / (Math.tan(Math.PI / n));
    }


}
