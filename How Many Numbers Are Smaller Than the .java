//How Many Numbers Are Smaller Than the Current Number

public int[] smallerNumbersThanCurrent(int[] nums) {
        
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int n:nums){
        list.add(n);
    }
    
    Collections.sort(list);
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i<list.size(); i++){
        if(!map.containsKey(list.get(i))){
            map.put(list.get(i), i);
        }
    }
    
    int[] result = new int[nums.length];
    
    for(int i=0; i<nums.length; i++){
        int n = map.get(nums[i]);
        result[i] = n;
    }
    
    return result;
}
