public class Hello {
    public static void main(String[] args) {

        // If arguments are provided
        if (args.length > 0) {

            System.out.print("Hello ");

            // Enhanced for loop
            for (String name : args) {
                System.out.print(name + " ");
            }

            System.out.println();
        } 
        // Default case
        else {
            System.out.println("Hello, World!");
        }

    }
}