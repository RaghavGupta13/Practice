//Segregate even odd numbers such that all even numbers appear before odd

static ArrayList<Integer> segregate_evens_and_odds(ArrayList<Integer> numbers) {
        // Write your code here.
        
        int even = -1;
        
        for(int i=0; i<numbers.size(); i++){
            if((numbers.get(i) % 2) == 0){
                even += 1;
                Collections.swap(numbers, i, even);
            }else{
                continue;
            }
        }
        
        return numbers;
    }