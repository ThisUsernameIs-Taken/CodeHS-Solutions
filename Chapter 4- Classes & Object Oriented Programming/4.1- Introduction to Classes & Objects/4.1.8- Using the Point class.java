public class PointTester extends ConsoleProgram
{
    public void run()
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
        
        // Make a new point here at position (2, 4)
        Point p1 = new Point(2, 4);
        System.out.println(p1);
        // Then print it out

    }
}
