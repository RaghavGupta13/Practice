//Merge one array into another

static ArrayList<Integer> merge_one_into_another(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Write your code here.
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int i=0;
        int j=0;
        
        while(i<first.size() && j<first.size()){
            if(first.get(i) < second.get(j)){
                result.add(first.get(i));
                i++;
            }else{
                result.add(second.get(j));
                j++;
            }
        }
        
        while(i<first.size()){
            result.add(first.get(i));
            i++;
        }
        
        while(j<first.size()){
            result.add(second.get(j));
            j++;
        }
        
        return result;
    }