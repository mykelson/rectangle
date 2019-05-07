public class Rectangle
{
    public int width = 0;
    public int height = 0;
    public Point origin;

    // Four constructor
    public Rectangle()
    {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p)
    {
        origin = p;
    }

    public Rectangle(int w, int h)
    {
        width = w;
        height = h;
        origin = new Point(0, 0);
    }

    public Rectangle(Point p, int w, int h)
    {
        origin = p;
        width = w;
        height = h;
    }

    // Method for moving the rectangle
    public void move(int x, int y)
    {
        origin.x = x;
        origin.y = y;
    }

    // method for computing the area of the rectangle
    public int getArea()
    {
        return width * height;
    }
}