public class CompressString {
    public static void main(String[] args){
        String s="aaa";
        StringBuilder sb=new StringBuilder();
        int n=s.length(),c=1;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }else{
                sb.append(s.charAt(i)).append(c);
                c=1;
            }
        }
        sb.append(s.charAt(n - 1)).append(c);
        System.out.println( sb.toString());
    }
}
