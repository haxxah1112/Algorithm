package RecursiceAndTreeAndGraph;

public class SubsetGenerator {
    static int n;
    static int[] ch;
    public void dfs(int level) {
        if(level == n+1){
            StringBuilder subset = new StringBuilder();
            for (int i=1; i<=n; i++) {
                if (ch[i] == 1) subset.append(i).append(" ");
            }
            if (subset.length() > 0) System.out.println(subset);
        } else {
            ch[level] = 1;
            dfs(level+1);
            ch[level] = 0;
            dfs(level+1);
        }
    }

    public static void main(String[] args) {
        SubsetGenerator generator = new SubsetGenerator();
        n = 3;
        ch = new int[n+1];
        generator.dfs(1);
    }
}
