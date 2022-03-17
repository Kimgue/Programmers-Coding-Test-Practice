package Hash;

import java.util.*;

public class player {

    public String solution(String[] participant, String[] completion) {
		
    	/*
    	//sort정렬 풀이
		Arrays.sort(participant); //1. 참가자 정렬
		Arrays.sort(completion); //2. 완주자 정렬
		
		for(int i=0; i<completion.length; i++) 
		{    
			//3. 완주자 배열  검색
			if (!participant[i].equals(completion[i])) 
			{
                return participant[i];
              //4. 완주자명단에 참가자가 없으면  참가자 리턴시켜준다
            }
		}
		return participant[participant.length - 1];
		// completion의 길이는 participant의 길이보다 1 작아서 1을 빼준다
		*/
		
		//hashmap 풀이
		Map<String,Integer> hm = new HashMap<>();
		
		// 참가자들 map에 key,value 값 넣어서 +1을 해준다.
		for(String player : participant)
		{
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		// 완주자들은 참가자명단 배열을 돈다음  -1을 한다음 0으로 만들어준다.
		for(String player : completion)
		{
			hm.put(player, hm.get(player)-1);
		}
		//map에서 1인 경우 키 값을 반환한다.
		for(String key : hm.keySet())
		{ 
			if(hm.get(key) != 0) 
			{
				return key;
			}
		}
		return null;
		
	}

}
