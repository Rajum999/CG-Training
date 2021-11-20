package doubts;

import java.util.ArrayList;
import java.util.List;
class  Arrayone
{
	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("A");
		ar.add("quick");
		ar.add("brown");
		ar.add("fox");
		ar.add("jumps");
		ar.add("over");
		ar.add("the");
		ar.add("lazy");
		ar.add("dog");

		String[] str=ar.toArray(new String[ar.size()]);
		for(String s:str){
			System.out.print(s+" ");
		}
		


	}
}
