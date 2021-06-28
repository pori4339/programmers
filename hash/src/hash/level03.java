package hash;

import java.util.HashMap;
import java.util.Map.Entry;

public class level03 {

	public static void main(String[] args) {
		System.out.println(	
			
				solution( new String[][] { {"yellowhat","headgear"}, {"bluesunglasses","eyewear"} , {"green_turban","headgear"}} )
				//	solution( new String[][] { {"crowmask","face"}, {"bluesunglasses","face"} , {"smoky_makeup","face"}} )
				
		);
	}
	
	/* 위장 */
	public static int solution(String[][] clothes) {
		int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
       
        for(int i = 0 ; i <clothes.length; i++) {
        	//System.out.println(clothes[i][1]);
        	
        	// 의상종류
        	String clothes_sort = clothes[i][1];
			map.put(clothes_sort, map.getOrDefault(clothes_sort, 0) + 1);

		}
        
     //   System.out.println("set:"+map.entrySet());

        for(Entry<String, Integer> entry : map.entrySet()) {
        	//System.out.println("value:"+entry.getValue());
        	
        	// 모든 옷 종류에 대해서 안 입는 경우가 있기 때문에 +1
        	answer = answer * (entry.getValue()+1);  
        	//System.out.println("answer:"+answer);
       }
              
        // 옷을 하나도 입지 않는 경우가 있으므로 -1
        return answer-1;
    }

	

}
