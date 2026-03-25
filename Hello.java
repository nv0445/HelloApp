public class Hello {
    public static void main(String[] args) {

        // If names are provided
        if (args.length > 0) {

            System.out.print("Hello ");

            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);

                // Add space between names
                if (i < args.length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        } 
        // Default case
        else {
            System.out.println("Hello World");
        }

    }
}