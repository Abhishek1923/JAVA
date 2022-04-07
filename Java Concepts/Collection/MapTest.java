import java.util.*;
class MapTest{
	public static void main(String[] args){
		HashMap map = new HashMap();
		//LinkedHashMap map = new LinkedHashMap();
		//TreeMap map = new TreeMap();
		//Hashtable map = new Hashtable();
		map.put("key1","value4");
		map.put("key2","value2");
		map.put("key3","value1");
		//map.put(null,null);//java.lang.NullPointerException
		System.out.println(map.get("key1"));
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue()+"\n");
		}
}
}