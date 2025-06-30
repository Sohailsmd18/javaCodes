public class Duplicates {
    public static void main(String[] args) {
        int a[]={4,3,2,7,8,2,3,1};
        int []arr=new int[26];
        int n=a.length;
        for(int i=0;i<n;i++){
            arr[a[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                System.out.println(i);
            }
        }
    }
}
