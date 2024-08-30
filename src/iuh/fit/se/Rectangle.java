package iuh.fit.se;

/**
 * description: This class to construct functions to get Perimeter and Area of restangle
 * author: Chung, Pham Van
 * version: 1.0
 * created: 8/29/2024 9:43 PM
 */
public class Rectangle {

    private double length;
    private double width;

    /**
     * The default constructor
     */
    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }

    /**
     * description: main constructor
     * param length the length of the rectangle
     * param width the width of the rectangle
     * throws IllegalArgumentException if length and width less than 0
     */
    public Rectangle(double length, double width){
        if (length < 0 || width < 0){
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * description: Set length for rectangle
     * param length the length of rectangle
     * throws IllegalArgumentException if length is less than 0
     */
    public void setLength(double length){
        if (length < 0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    /**
     * description: Set width for the rectangle
     * param width the width of rectangle
     * throws IllegalArgumentException if width is less than 0
     */
    public void setWidth(double width){
        if (width < 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    /**
     * description: get length of rectangle
     * return length values
     */
    public double getLength(){
        return length;
    }

    /**
     * description: get width of rectangle
     * return width values
     */
    public double getWidth(){
        return width;
    }

    /**
     * description: calculate Area of rectangle
     * return area of rectangle
     */
    public double getArea(){
        return length * width;
    }

    /**
     * description: calculate perimeter of rectangle
     * return perimeter of rectangle
     */
    public double getPerimeter(){
        return (length + width) * 2;
    }

    /**
     * description: Set format for println
     * return string format
     */
    @Override
    public String toString() {
        return String.format("\nArea: " + getArea() + "\nPerimeter: " + getPerimeter());
    }
}
