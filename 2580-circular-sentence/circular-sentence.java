class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        if (words[0].charAt(0) != words[words.length-1].charAt(words[words.length-1].length() - 1)) return false;

        for (int i = 0; i < words.length - 1; i++){
            if (words[i+1].charAt(0) != words[i].charAt(words[i].length() - 1)) return false;
        }
        
        return true;
    }
}