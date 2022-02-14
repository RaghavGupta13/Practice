//kth largest element in array

public static int kth_largest_in_an_array(List<Integer> numbers, int k) {
    Collections.sort(numbers);
    
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for(Integer num : numbers){
        minHeap.add(num);
        
        if(minHeap.size() > k){
            minHeap.poll();
        }
    }
    
    return minHeap.poll();
}
