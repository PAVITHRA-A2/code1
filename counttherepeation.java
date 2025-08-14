

import java.util.Scanner;

class Solution { 
    public int count(String dataStream) {
        int n = dataStream.length();

        // Manually create reversed string without StringBuilder
        String rev = "";
        for (int i = n - 1; i >= 0; i--) {
            rev += dataStream.charAt(i); // append characters from end
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (dataStream.charAt(i) == rev.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}

public class counttherepeation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataStream = sc.nextLine();
        Solution s = new Solution();
        int output = s.count(dataStream);
        System.out.println(output);
        sc.close();
    }
}


