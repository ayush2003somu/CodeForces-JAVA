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
            String [] str = br.readLine().split(" ");
            long a = Long.parseLong(str[0]);
            long b = Long.parseLong(str[1]);
            int n = Integer.parseInt(str[2]);
            long timer = b;
            String[] tools = br.readLine().split(" ");
            for (int i=0;i<n;i++){
                long temp = Long.parseLong(tools[i]);
                timer+=Math.min(temp,a-1);
            }
            output.append(timer).append("\n");   
        }
        System.out.println(output);
    }
}
