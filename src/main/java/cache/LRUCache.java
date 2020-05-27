package cache;

import java.util.LinkedHashMap;
import java.util.Map;

/*LRU Cache Implementation via LinkedHashMap*/

public class LRUCache {
	
	LinkedHashMap<Integer, Integer> map;
	int CAPACITY = 5;
	
	@SuppressWarnings("serial")
	public LRUCache(int capacity) {
		this.CAPACITY = capacity;
		map = new LinkedHashMap<Integer, Integer>(CAPACITY, 0.75f, true) {
			protected boolean removeEldestEntry(Map.Entry eldest)
			{
				return size() > CAPACITY;
			}
		};
	}
	
	
	public Integer put(int key, int value)
	{
		return map.put(key, value);
	}
	

	public Integer get(int key)
	{
		return map.getOrDefault(key, -1);
	}
	
}
