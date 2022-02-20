//kth largest element in a Stream

static ArrayList<Integer> kth_largest(Integer k, ArrayList<Integer> initial_stream, ArrayList<Integer> append_stream) {
    // Write your code here.
    
    ArrayList<Integer> result = new ArrayList<>();
    
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
    
    for(Integer i : initial_stream){
        pq.add(i);
        
        if(pq.size() > k){
            pq.poll();
        }
    }
    
    for(Integer n : append_stream){
        pq.add(n);
        
        if(pq.size() > k){
            pq.poll();
        }
        
        result.add(pq.peek());
    }
    return result;
}