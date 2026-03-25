public class Hello {
    public static void main(String[] args) {

        // If arguments are provided
        if (args.length > 0) {

            String result = "Hello ";

            // Enhanced for loop
            for (String name : args) {
                result += name + " ";
            }

            // Remove trailing space using substring
            result = result.substring(0, result.length() - 1);

            System.out.println(result);
        } 
        // Default case
        else {
            System.out.println("Hello, World!");
        }

    }
}