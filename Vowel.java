import java.util.Scanner;

class Form {
    public String call(String input) {
        // Replace all vowels with empty string
        //replaceAll("regex",replacement);
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Form f = new Form();
        String result = f.call(input);
        System.out.println(result);
    }
}
