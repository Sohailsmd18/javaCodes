import java.util.*;
class FirstNonRepeated {
  public static void main(String[] args) {
    String[] s = {"apple", "racecars"};
    char[] ch=new char[s.length];
    for(int i=0;i<s.length;i++){
      String str=s[i];
      HashMap<Character,Integer>hm=new LinkedHashMap<>();
      for(int j=0;j<str.length();j++){
          char c=str.charAt(j);
          hm.put(c,hm.getOrDefault(ch,0 )+1);
      }
      for(char c1:hm.keySet()){
        if(hm.get(c1)==1){
          ch[i]=c1;
          break;
        }
      }

    }
    for(int i=0;i<ch.length;i++){
      System.out.print(ch[i]);
    }

  }
}
