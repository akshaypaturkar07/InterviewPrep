public class CheckPalindrome {
    public static void main(String[] args) {
        String str =  "akshay";
        System.out.println(checkPalindrome(str));
    }

    static Boolean checkPalindrome(String str){
        Boolean result =  false;
        char[] chars = str.toCharArray();
        int start = 0;
        int end =  chars.length-1;
        while(start < end){
            if(chars[start] == chars[end]){
                result =  true;
            }else{
                result = false;
                break;
            }
            start++;
            end--;
        }
        return result;
    }
}
