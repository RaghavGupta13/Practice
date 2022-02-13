//Top k Frequent elements

//Method #1

static ArrayList<Integer> find_top_k_frequent_elements(ArrayList<Integer> arr, Integer k) {
    // Write your code here.
    
    ArrayList<Integer> result = new ArrayList<>();
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i<arr.size(); i++){
        int num = arr.get(i);
        
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
    
    for(Integer key : map.keySet()){
        maxHeap.add(key);
    }
    
    for(int i=0; i<k; i++){
        result.add(maxHeap.poll());
    }
    
    return result;


    //Method #2
    static ArrayList<Integer> find_top_k_frequent_elements(ArrayList<Integer> arr, Integer k) {
        // Write your code here.
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.size(); i++){
            int num = arr.get(i);
            
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        
        for(Integer key: map.keySet()){
            minHeap.add(key);
            
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        
        return new ArrayList<>(minHeap);
    }
