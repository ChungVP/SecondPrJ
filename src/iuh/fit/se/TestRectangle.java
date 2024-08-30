package iuh.fit.se;

/**
 * description: This class use to run code to get Perimeter and Area of Restangle.
 * author: Chung, Pham Van
 * version: 1.0
 * created: 8/29/2024 9:51 PM
 */
public class TestRectangle {
    /**
     * description: This is main to run code
     * param args
     */
     public static void main(String[] args) {
         Rectangle res1 = new Rectangle(3.5,8);
         Rectangle res2 = new Rectangle(6.0,7.8);

         res1.setLength(5.0);
         res2.setWidth(9.5);

         System.out.println(res1);
         System.out.println(res2);
     }
}
