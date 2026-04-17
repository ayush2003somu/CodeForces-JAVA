import java.io.*;
public class demo {
    public static void main(String[] args) throws Exception {
        BufferedReader br;
        if (System.getProperty("ONLINE_JUDGE") == null) {
            br = new BufferedReader(new FileReader("input.txt"));
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        int tc = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        while(tc-->0){
            long n = Long.parseLong(br.readLine());
            int count=0;
            for (long i=1;i<=n;i++){
                if (n%i==0)count++;
                else break;
            }
            output.append(count).append("\n");
        }
        System.out.println(output);
    }
}
