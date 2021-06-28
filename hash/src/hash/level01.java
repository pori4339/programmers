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
	
	/* �ؽ� - �������� ���� ���� */
	public static String solution(String[] participant, String[] completion) {

		/**
		 * 	������ �������� �̸��� ��� �迭 participant
		 *  ������ �������� �̸��� ��� �迭 completion
		 *  �������� ���� ������ �̸��� return
		 * */
	
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // participant �迭�� ��� ���� �ؽ� �ʿ� �־���
        for (String part : participant) {        	
        	// key = ���ڿ�, value = ���� �ʿ� ����� ���ڿ� ������ + 1
        	map.put(part, map.getOrDefault(part, 0) + 1);
        	// System.out.println(map);
        }
        
        // completion �迭�� ��� ���� �ؽ� �ʿ� �־���
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
