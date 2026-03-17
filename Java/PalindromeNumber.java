class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String reversedNumber = "";

        for(int i = number.length() - 1; i >= 0; i--){
            reversedNumber += number.charAt(i);
        }

        return number.equals(reversedNumber);
    }
}