package DFS;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
    /**
     * Given a list of unique letters, find all of its distinct permutations.
     *
     * Input:
     *
     * ['a', 'b', 'c']
     * Output:
     *
     * [['a', 'b', 'c'], ['a', 'c', 'b'], ['b', 'a', 'c'], ['b', 'c', 'a'], ['c', 'a', 'b'], ['c', 'b', 'a']]
     * @param letters
     * @return
     */

    public static List<List<Character>> permute(char[] letters) {
        List<List<Character>> res = new ArrayList<>();
        dfs(new ArrayList<>(), new boolean[letters.length], res, letters);
        return res;
    }

    private static void dfs(List<Character> path, boolean[] used, List<List<Character>> res, char[] letters) {
        if (path.size() == used.length) {
            // make a deep copy since otherwise we'd be append the same list over and over
            res.add(new ArrayList<Character>(path));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            // skip used letters
            if (used[i]) continue;
            // add letter to permutation, mark letter as used
            path.add(letters[i]);
            used[i] = true;
            dfs(path, used, res, letters);
            // remove letter from permutation, mark letter as unused
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
