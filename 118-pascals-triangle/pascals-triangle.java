class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        for (int i=0;i<numRows-1;i++) {
            List<Integer> d=new ArrayList<>();
            d.add(0);
            d.addAll(res.get(res.size()-1));
            d.add(0);
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<d.size()-1;j++) {
                row.add(d.get(j)+d.get(j+1));
            }
            res.add(row);
        }
        return res;        
    }
}