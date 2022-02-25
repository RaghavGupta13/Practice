//Minimum Sum of Four Digit Number After Splitting Digits

public int minimumSum(int num) {
        
    String str = String.valueOf(num);
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i=0; i<str.length(); i++){
        char c = str.charAt(i);
        int n = Character.getNumericValue(c);
        list.add(n);
    }
    
    Collections.sort(list);
    
    String s1 = String.valueOf(list.get(0)) + String.valueOf(list.get(3));
    String s2 = String.valueOf(list.get(1)) + String.valueOf(list.get(2));   
    
    return Integer.parseInt(s1) + Integer.parseInt(s2);
    
}