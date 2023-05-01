package Wk6hwk;
/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Q13 {
    public static void main(String[] args)
    {
        double Width = 5.6, Height = 8.5;
        double Area = 5.6 * 8.5;
        double Perimeter = 2 * (Width+Area);

        System.out.println("Expected Output: ");
        System.out.println("Area is 5.6 * 8.5 = " + Area);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) =" + Perimeter);
    }


}
