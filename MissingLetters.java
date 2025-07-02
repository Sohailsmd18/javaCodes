public class MissingLetters {
    public static void main(String[] args) {
        String s="qwertyuiopasdfghjklxcvbn";
        int []a=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int x=ch-'a';
            a[x]=1;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                char c=(char)(i+'a');
                System.out.print(c);
            }
        }
    }
}
