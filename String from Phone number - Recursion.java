//String from Phone number - Recursion

private static void dialPad(String number){
    String[] dialpad = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    StringBuffer slate = new StringBuffer();
    ArrayList<String> result = new ArrayList<>();

    helper(number, slate, 0, dialpad, result);
    System.out.println(result);
 }

 private static void helper(String number, StringBuffer slate, int i, String[] dialpad, ArrayList<String> result){
    if(i == number.length()){
        result.add(new String(slate));
        return;
    }

    if(number.charAt(i) == '0' || number.charAt(i) == '1'){
       slate.append(number.charAt(i));
       helper(number, slate, i+1, dialpad, result);
    }

    else{
        String temp = dialpad[number.charAt(i) - '0'];

        for(int p=0; p<temp.length(); p++){
            slate.append(temp.charAt(p));
            helper(number, slate, i+1, dialpad, result);
            slate.delete(i, slate.length());
        }
    }
 }

public static void main(String[] args){
     dialPad("9112");
}