//Implement Merge Sort

static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {
        
    int left = 0;
    int right = arr.size()-1;
    
    helper(arr, left, right);
    return arr;
}

static void helper(ArrayList<Integer> arr, int left, int right){
    
    if(left>=right) return;
    
        int mid = (left + (right-left)/2);
        
        helper(arr, left, mid);
        helper(arr, mid+1, right);
        merge(arr, left, mid, right);
    
}

static void merge(ArrayList<Integer> arr, int left, int mid, int right){
    
    int i=left;
    int j = mid+1;
    
    ArrayList<Integer> result = new ArrayList<>();
    
    while(i<=mid && j<=right){
        if(arr.get(i) < arr.get(j)){
            result.add(arr.get(i));
            i++;
        }else{
            result.add(arr.get(j));
            j++;
        }
    }
    
    while(i<=mid){
        result.add(arr.get(i));
        i++;
    }
    
    while(j<=right){
        result.add(arr.get(j));
        j++;
    }
    
    for(int r=left; r<=right; r++){
        arr.set(r, result.get(r-left));
    }
    
}