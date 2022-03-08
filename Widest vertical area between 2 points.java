//Widest vertical area between 2 points

public int maxWidthOfVerticalArea(int[][] points) {
        
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i=0; i<points.length; i++){   //O(n)
        int num = points[i][0];
        
        list.add(num);
    }
    
    Collections.sort(list);               //O(nlogn)
    
    int max = Integer.MIN_VALUE;
    
    for(int i=0; i<list.size()-1; i++){    //O(n)
        int diff = list.get(i+1) - list.get(i);
        
        max = Math.max(max, diff);
    }
  
    return max;
    
}