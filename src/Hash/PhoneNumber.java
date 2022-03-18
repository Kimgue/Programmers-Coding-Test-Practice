package Hash;
import java.util.*;
public class PhoneNumber {
	 public boolean solution(String[] phoneBook) {
		 
		 Map<String,Integer> hm = new HashMap<>();
		 
		 //map put담기
		 for(int i=0; i<phoneBook.length; i++)
		 {
			 hm.put(phoneBook[i], i);
		 }
		 
		 
		 for(int i=0; i<phoneBook.length; i++)
		 {
			 for(int j=0; j<phoneBook[j].length(); j++)
			 {	
				 //hm담은 값중 phonebook에서 접두사가 있는지 substring으로 
				 // 0~phoneBook[j] 길이만큼 조회하여
				 //있으면 false반환
				 if(hm.containsKey(phoneBook[i].substring(0,j)))
					 return false;
			 }
		 }
		 //없으면 true
		 return true;
	 }
}
