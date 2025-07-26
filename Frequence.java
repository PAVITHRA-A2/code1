import java.util.*;

public class Frequence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(a[i]+" occurs "+count+" time");
        }
    }
}