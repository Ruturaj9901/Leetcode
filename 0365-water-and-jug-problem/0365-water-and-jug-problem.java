
import java.util.*;

class Solution {

    Set<String> visited = new HashSet<>();

    public boolean canMeasureWater(int x, int y, int target) {
        return dfs(0, 0, x, y, target);
    }

    boolean dfs(int a, int b, int x, int y, int target) {

        if (a + b == target)
            return true;

        String state = a + "," + b;

        if (visited.contains(state))
            return false;

        visited.add(state);

        int pour1 = Math.min(a, y - b);
        int pour2 = Math.min(b, x - a);

        return dfs(x, b, x, y, target) ||
               dfs(a, y, x, y, target) ||
               dfs(0, b, x, y, target) ||
               dfs(a, 0, x, y, target) ||
               dfs(a - pour1, b + pour1, x, y, target) ||
               dfs(a + pour2, b - pour2, x, y, target);
    }
}
