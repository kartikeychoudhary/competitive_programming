import java.util.Arrays;

public class LongestCommonPrefix {

    public static char[] trimPrefixtoMatch(char[] prefix, String test){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < prefix.length && i < test.length(); i++){
            if(prefix[i] == test.charAt(i)){
                sb.append(prefix[i] + "");
            }else{
                break;
            }
        }
        return sb.toString().toCharArray();
    }

    public static String longestCommonPrefix(String[] strs) {
        char[] prefix = strs.length > 0 ? strs[0].toCharArray() : new char[]{};

        for (String test : strs) {
            if(!test.startsWith(prefix.toString())){
                prefix = trimPrefixtoMatch(prefix, test);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char x : prefix){
            sb.append(x+"");
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] cases = new String[]{"flower","flow","flight"};
        System.out.println(
            longestCommonPrefix(cases)
        );
    }
}