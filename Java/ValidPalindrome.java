public class ValidPalindrome {
    public boolean isPalindrome_v2(String s) {
        String newString = s.toLowerCase().replaceAll("[^a-z0-9]","");

        int start = 0;
        int end = newString.length()-1;
        
        while(start < end){
            if(newString.charAt(start) != newString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome_v1(String s) {
        String newString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int left = newString.length()-1;
        int right = 0;

        for(int i = 0; i < newString.length(); i++){
            if(newString.charAt(right) != newString.charAt(left)){
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}