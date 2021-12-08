package DP;

import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> words) {
        int len = s.length();
        boolean [] dp = new boolean [len+1];
        dp[len] = true;

        for (int i = len-1; i>=0; i--){
            for (String word: words){
                if (i+word.length() <= len && s.substring(i).startsWith(word))
                    dp[i] = dp[i+word.length()];
                if (dp[i])
                    break;
            }
        }
        return dp[0];
    }
}
