class Solution {
    int minQuiet;
    public void dfs(ArrayList<Integer>[] graph, int i, boolean[] isVisited, int[] quiet){
        isVisited[i] = true;
        for(int ngbr : graph[i]){
            if(!isVisited[ngbr]){
                dfs(graph, ngbr, isVisited, quiet);
            }
        }
        minQuiet = (minQuiet==-1 || quiet[i]<quiet[minQuiet])? i : minQuiet;
    }
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] e : richer){
            int u = e[0];
            int v = e[1];
            graph[v].add(u); 
        }
        int[] res = new int[n]; 
        for(int i=0; i<n; i++){
            minQuiet = -1; 
            dfs(graph, i, new boolean[n], quiet); 
            res[i] = minQuiet;
        }
        return res;
    }
}