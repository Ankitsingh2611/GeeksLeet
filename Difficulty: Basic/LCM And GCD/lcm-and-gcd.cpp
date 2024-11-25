//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    // helper function to get gcd of two numbers.
    int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    vector<int> lcmAndGcd(int a, int b) {

        vector<int> arr(2);
        // gcd of two numbers.
        int g = gcd(a, b);
        // product of 2 numbers divided by their gcd gives their lcm.
        int l = (a * b) / g;

        arr[0] = l;
        arr[1] = g;

        return arr;
    }
};


//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        int A, B;

        cin >> A >> B;

        Solution ob;
        vector<int> ans = ob.lcmAndGcd(A, B);
        cout << ans[0] << " " << ans[1] << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends