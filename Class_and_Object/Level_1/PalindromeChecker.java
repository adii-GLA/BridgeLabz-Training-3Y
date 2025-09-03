class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return text.equalsIgnoreCase(rev);
    }

    void display() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.text = "madam";
        pc.display();
    }
}