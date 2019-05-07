public class CreateRectangleDemo
{
    public static void main(String args[])
    {
        // Declare and create a Point object
        // and two Rectangle objects
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // Display the rectOne's widht, height and area
        System.out.println("The width of rectOne is " + rectOne.width);
        System.out.println("The height of rectOne is " + rectOne.height);
        System.out.println("The area of rectOne is " + rectOne.getArea());

        // Set rectTwo position
        rectTwo.origin = originOne;

        // Display rectTwo's position
        System.out.println("The x position of rectTwo is " + rectTwo.origin.x);
        System.out.println("The y position of rectTwo is " + rectTwo.origin.y);

        // Move rectTwo and display it's new position
        rectTwo.move(42, 72);
        System.out.println("The x position of rectTwo is now " + rectTwo.origin.x + " after moving it.");
        System.out.println("The y position of rectTwo is now " + rectTwo.origin.y + " after moving it.");
    }
}