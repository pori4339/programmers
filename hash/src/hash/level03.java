package hash;

import java.util.HashMap;

public class level03 {

	public static void main(String[] args) {
		System.out.println(	
				//	solution( new String[] { "119", "97674223", "1195524421"})
					solution( new String[] { "123", "456", "789"})
				//	solution( new String[] { "119", "97674223", "1195524421"})
		);
	}
	
	/* ��ȭ��ȣ ��� */
	public static boolean solution(String[] phone_Book) {
		
	// ��� 1
		/*
		boolean answer = true;
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i <phone_Book.length; i++) {
			map.put(phone_Book[i], i);
			//System.out.println(map);
		}
		
		for(String p : phone_Book) {
			for(int j = 0 ; j < p.length() ; j++) { 
				System.out.println(p.substring(0,j));
				System.out.println(map.containsKey(p.substring(0,j)));
				if(map.containsKey(p.substring(0,j))) {  // containsKey =>  �ʿ� key ���� �ִ��� Ȯ��			
					answer = false;
				}
			}
		}
		*/
		
		boolean answer = true;
		
		 for(int i=0; i < phone_Book.length-1; i++) {
            for(int j=i+1; j<phone_Book.length; j++) {
            	System.out.println("1:"+phone_Book[i]);
            	System.out.println("2:"+phone_Book[j]);
            	if(phone_Book[i].startsWith(phone_Book[j])) {return false;}
                if(phone_Book[j].startsWith(phone_Book[i])) {return false;}
                
            }
        }
	
		
		
		return answer;
	 }


	

}
