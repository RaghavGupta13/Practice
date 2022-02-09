//Dutch National Flag Problem

static ArrayList<Character> dutch_flag_sort(ArrayList<Character> balls) {
        // Write your code here.
        
        
        int i=0; 
        int r = -1;
        int g = -1;
        
        while(i<balls.size()){
            if(balls.get(i) == 'G'){
                g++;
                Collections.swap(balls, i, g);
                i++;
            }
            else if(balls.get(i) == 'R'){
                //1st swap
                g++;
                Collections.swap(balls, i, g);
                
                //2nd swap
                r++;
                Collections.swap(balls, g, r);
                
                i++;
            }
            else{
                i++;
            }
        }