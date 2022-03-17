package Hash;

import java.util.*;

public class player {

    public String solution(String[] participant, String[] completion) {
		
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
	}

}
