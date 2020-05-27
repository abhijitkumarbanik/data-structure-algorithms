package cache;

public class LRUCacheDemo {

	public static void main(String[] args) {

		LRUCache cache = new LRUCache(3);
		cache.put(1, 111);
		cache.put(2, 222);
		cache.put(3, 222);
		cache.put(2, 444);
		cache.put(2, 555);
		cache.put(3, 666);

		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));

		cache.put(4, 777);

		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4));

		cache.put(5, 666);

		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4));
		System.out.println(cache.get(5));

	}

}
