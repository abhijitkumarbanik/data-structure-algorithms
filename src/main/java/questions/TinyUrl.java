/* http://www.geeksforgeeks.org/how-to-design-a-tiny-url-or-url-shortener/ */

//Given the database unique id of an url 
//convert it into tiny url
package questions;

public class TinyUrl
{
	public String idToTinyUrl(int id)
	{
		String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder tinyUrl = new StringBuilder();
		while(id>0)
		{
			tinyUrl.append(map.charAt(id%62));
			id /= 62;
		}
		return tinyUrl.reverse().toString();
	}

	public int tinyUrlToId(String tinyUrl)
	{
		int id = 0;
		String map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for(int i=0;i<tinyUrl.length();i++)
		{
			id = (id*62) + map.indexOf(tinyUrl.charAt(i));
		}
		return id;
	}

	public static void main(String args[])
	{
		int id = 12345;
		TinyUrl t = new TinyUrl();
		System.out.println(t.idToTinyUrl(id));
		System.out.println(t.tinyUrlToId("dnh"));
	}
}