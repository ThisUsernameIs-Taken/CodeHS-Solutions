public class PrintOdd extends ConsoleProgram
{
    public void run()
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
    }
    
    public void printOddIndices(int[] arr)
    {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
        // Start here!
    }
}
