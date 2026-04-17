import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
public class demo {
    public static void main(String[] args) throws Exception {
        BufferedReader br ;
        if (System.getProperty("ONLINE_JUDGE") == null) {
            br = new BufferedReader(new FileReader("input.txt"));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        int tc = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        while(tc-->0){
            String[] str = br.readLine().split(" ");
            long n = Long.parseLong(str[0]);
            long k = Long.parseLong(str[1]);
            long x = Long.parseLong(str[2]);
            long minSum = (k*(k+1)/2);
            long total = n * (n + 1) / 2;
            long remove = (n - k) * (n - k + 1) / 2;
            long maxSum = total - remove;
            if (x>=minSum && x<=maxSum){
                output.append("YES").append("\n");
            }else{
                output.append("NO").append("\n");
            }
        }System.out.println(output);
    }
}
