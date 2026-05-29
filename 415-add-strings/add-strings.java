class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        StringBuilder a=new StringBuilder();
        while(i>=0 ||j>=0 || c>0){
            int d1=0,d2=0;
            if(i>=0){
                d1+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                d2+=num2.charAt(j)-'0';
                j--;
            }
            int sum=d1+d2+c;
            a.append(sum%10);
            c=sum/10;
        }
        return a.reverse().toString();
    }
}