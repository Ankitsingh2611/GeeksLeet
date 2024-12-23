//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
      static int evenlyDivides(int N) {
        int cnt = 0;
        int temp = N;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp /= 10;
            if (lastDigit != 0 && N % lastDigit == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}