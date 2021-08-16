package adeneme;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class bbb {

    /*
     * Complete the twoSubsequences function below.
     */
    static int twoSubsequences(int[] X, int r, int s) {
        /*
         * Write your code here.
         */
        final long MOD=1000000007;
        int n = (r + s) / 2, l = (r - s) / 2;
        int m=X.length;
        long result=0;
        long[][] dp=new long[n + 1][m + 1];
        dp[0][0] = 1;
    if(X[0] <= n) {
        dp[X[0]][1] = 1;
    }
    for(int i = 1; i < m; i++) {
        dp[0][0] = 1;
        for(int k = 1; k <= m; k++) {
            dp[0][k] = 0;
        }
        for(int j = n; j >= 1; j--) {
            dp[j][0] = 0;
            for(int k = 1; k <= m; k++) {
                if(j < X[i]) {
                    dp[j][k] = dp[j][k];
                } else {
                    dp[j][k] = (dp[j - X[i]][k - 1] + dp[j][k]) % MOD;
                }
            }
        }
    }
    if(l >= 0 && (r + s) % 2 != 1 && (r - s) % 2 != 1 && r != 0) {
        for(int i = 0; i <= m; i++) {
            result = (result + dp[n][i] * dp[l][i]) % MOD;
        }
    }
    return (int)result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] mrs = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mrs[0].trim());

        int r = Integer.parseInt(mrs[1].trim());

        int s = Integer.parseInt(mrs[2].trim());

        int[] x = new int[m];

        String[] xItems = scanner.nextLine().split(" ");

        for (int xItr = 0; xItr < m; xItr++) {
            int xItem = Integer.parseInt(xItems[xItr].trim());
            x[xItr] = xItem;
        }

        int result = twoSubsequences(x, r, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}