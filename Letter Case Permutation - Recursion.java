//Letter Case Permutation - Recursion

private static void ways(String s){
    ArrayList<String> result = new ArrayList<>();
    StringBuffer slate = new StringBuffer();

    helper(s, 0, slate, result);
    System.out.println(result);
}

private static void helper(String s, int i, StringBuffer slate, ArrayList<String> result){

    if(i == s.length()){
        result.add(new String(slate));

        return;
    }

    if(Character.isDigit(s.charAt(i))){
        slate.append(s.charAt(i));
        helper(s, i+1, slate, result);
    }
    else{
        slate.append(Character.toLowerCase(s.charAt(i)));
        helper(s, i+1, slate, result);
        slate.delete(i, slate.length());

        slate.append(Character.toUpperCase(s.charAt(i)));
        helper(s, i+1, slate, result);

    }
}

public static void main(String[] args) {
    ways("a1b2");
}