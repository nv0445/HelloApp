public class Hello {
    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } 
        // Default case
        else {
            System.out.println("Hello World");
        }

    }
}