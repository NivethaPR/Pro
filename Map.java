package Guvi;
import java.util.*;
import java.util.Scanner;
public class Map {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashMap hs=new HashMap();
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
		hs.put(in.next(),in.next());
		}
		if(hs.containsKey("a"))
		hs.put("b",hs.get("a"));
		hs.remove("c");
		System.out.println(hs);


	}

}
