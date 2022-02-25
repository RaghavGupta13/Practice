//Sorting the sentence

 public String sortSentence(String s){
     String[] wordArray = s.split(" ");
     String[] newArr = new String[wordArray.length];
        
        for(int i=0; i<wordArray.length; i++){
            String word = wordArray[i];
            int num = word.charAt(word.length() - 1) - '1';
            newArr[num] = word.substring(0, word.length()-1);
        }
        
        return String.join(" ", newArr);
 }