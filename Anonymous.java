import java.util.HashMap;
import java.util.Map;

public class Anonymous {
      public int howMany(String[] headlines, String[] messages) {
        Map<Character,Integer> allLetters = new HashMap<>();
        String all = String.join("",headlines); //String.join 
        for(char ch: all.toLowerCase().toCharArray()){
            int occ = allLetters.getOrDefault(ch,0);
            allLetters.put(ch,occ+1);//go to the map, find everything that occurs, increment by 1
//or int[] allLetters = new int[300]; ... to make it into an int array         
        
        }
        int count = 0;
        for (String s : messages) {
            if (canMake(s,allLetters)) {
                count+= 1;

            }
        }
        return count;
      }

      private boolean canMake(String s, Map<Character,Integer> allLetters) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: s.toLowerCase().toCharArray()){
            int occ = map.getOrDefault(ch,0);
            map.put(ch,occ+1);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int have = allLetters.getOrDefault(ch, 0);
            int need = map.getOrDefault(ch, 0);
            if (need > have) return false;
            }
        
        return true;
      }
    }
    
   