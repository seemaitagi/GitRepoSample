import java.util.HashMap;

public class Samplegitprg {

	public static void main(String[] args) {
		String str="Seema Itagi";
		char[] charr=str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character c: charr)
		{
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
				
			}
			
		}
		
		
		System.out.println("added");
	
		System.out.println(map);		
				
		}
		

	}


