public class Messages extends ConsoleProgram
{
    public void run()
    {
        TextMessage txt1 = new TextMessage("Bart", "Lisa", "Where are you?");
        TextMessage txt2 = new TextMessage("Lisa", "Bart", "I'm at school!");
        System.out.println(txt1);
        System.out.println(txt2);
        // Your code here.
        // Create the two TextMessage objects and print them out.
    }
}
