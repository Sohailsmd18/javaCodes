public class CountCharacters {
    public static String compress(String input){
        StringBuilder sb = new StringBuilder();
        int n = input.length();

        for(int i = 0; i < n; i++){
            char ch = input.charAt(i);
            int c = 1;

            while(i + 1 < n && input.charAt(i + 1) == ch){
                c++;
                i++;
            }

            sb.append(ch).append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabbabcdee";
        String output = compress(input);
        System.out.println("Compressed string: " + output);
    }
}
