public class App {

public static String reverse(String input)
{
    StringBuilder stringReverse = new StringBuilder(input);
    return stringReverse.reverse().toString();
}

    public static void main(String[] args) throws Exception {
        
        String input = "Hello";
        String output = reverse(input);
        System.err.println(output);
    }
}
