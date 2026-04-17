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
        while(tc-->0){
            
        }
        br.close();
    }
}
