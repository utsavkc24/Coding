/*First unique character*/
  
public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        int[] dummy = new int[256];
        Arrays.fill(dummy, -1);
        
        for(int i = s.length() - 1; i >= 0; i--){
            if(dummy[s.charAt(i)] == -1){
                dummy[s.charAt(i)] = i;
            }
            else
                dummy[s.charAt(i)] = -2;
        }
        
        for(int i = 0; i < 256; i++){
            if(dummy[i] >= 0){
                res = Math.min(res, dummy[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }