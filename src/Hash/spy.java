package Hash;
import java.util.HashMap;

public class spy {
	public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
    	
        
    	for(int i = 0; i < clothes.length; i++)
    	{
    		
    		if(map.get(clothes[i][1]) == null)
    			//의상  map에 넣기
    			map.put(clothes[i][1], 1);
    		
    		else
    			//의상종류 중복 갯수 증가+1
    			map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
    	}
    	
    	//경우의 수를  구함
    	for(String keys: map.keySet()) {
    		answer *= (map.get(keys) + 1);
    	}
        
    	//하나도 안입는 선택지는 없으므로 경우의 수 하나를 뺀다
    	answer -= 1;
    	
        return answer;
    }
}
