// pass two argument during JVM with else condition
class BA {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}
