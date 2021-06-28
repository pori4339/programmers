package hash;

import java.util.HashMap;
import java.util.Map.Entry;

public class level01 {

	public static void main(String[] args) {
		System.out.println(	
				solution( new String[] { "mislav", "stanko", "mislav", "ana" },
						  new String[] { "stanko", "ana", "mislav" })
		);
	}
	
	/* 해시 - 완주하지 못한 선수 */
	public static String solution(String[] participant, String[] completion) {

		/**
		 * 	참여한 선수들의 이름이 담긴 배열 participant
		 *  완주한 선수들의 이름이 담긴 배열 completion
		 *  완주하지 못한 선수의 이름을 return
		 * */
	
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // participant 배열의 모든 값을 해시 맵에 넣어줌
        for (String part : participant) {        	
        	// key = 문자열, value = 현재 맵에 저장된 문자열 갯수에 + 1
        	map.put(part, map.getOrDefault(part, 0) + 1);
        	// System.out.println(map);
        }
        
        // completion 배열의 모든 값을 해시 맵에 넣어줌
        for (String comp : completion) {
        	map.put(comp, map.get(comp) - 1);
        }
        
        for(Entry<String, Integer> entry : map.entrySet()) {
        	 if(entry.getValue() > 0) {
        		 answer = entry.getKey();
        		 break;
        	 }
             
        	System.out.println(map.entrySet());
        	System.out.println(map.keySet());
        	
        }
       
        return answer;
    }

}
