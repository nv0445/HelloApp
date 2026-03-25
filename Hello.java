public class Hello {
    public static void main(String[] args) {

        // If arguments are provided
        if (args.length > 0) {
            // Join all arguments with space
            String result = String.join(" ", args);
            System.out.println("Hello " + result);
        } 
        // Default case
        else {
            System.out.println("Hello, World!");
        }

    }
}