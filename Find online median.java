//Find online median

static ArrayList<Integer> online_median(ArrayList<Integer> stream) {
    // Write your code here.
  
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    ArrayList<Integer> result = new ArrayList<>();
    
    int size = 0;
    
    for(Integer i : stream){
        
        if(maxHeap.size() <= minHeap.size()){
            minHeap.add(i);
            maxHeap.add(minHeap.poll());
        }else{
            maxHeap.add(i);
            minHeap.add(maxHeap.poll());
        }
        
        size++;
        
        if(size % 2 == 0){
            int mid = (maxHeap.peek() + minHeap.peek())/2;
            result.add(mid);
        }else{
            result.add(maxHeap.peek());
        }
        
    }
    
    
    return result;
}