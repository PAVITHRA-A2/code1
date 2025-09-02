//Leetcode
//58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
       String[] word = s.trim().split("\\s+");
        return word[word.length - 1].length();
    }
}
