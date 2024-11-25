//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int first, second;

        // There should be at least two elements
        if (n < 2) {
            return -1;
        }

        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            // If current element is greater
            // than first then update both
            // first and second
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            // If arr[i] is in between first
            // and second then update second
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            return -1;
        else
            return second;
    }
}
