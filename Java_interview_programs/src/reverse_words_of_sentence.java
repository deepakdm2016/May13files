import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class reverse_words_of_sentence {

	public static void main(String v[])
	{
		String test="Hello God thanks God for the rebirth and allowing me to work again";
		
		List<String> words=Arrays.asList(test.split(" "));
		StringBuilder output=new StringBuilder(test.length());
		for(int i=0;i<words.size();i++)
		{
			StringBuilder sb=new StringBuilder(words.get(i));
			sb.reverse();
			output.append(sb).append(' ');
			
			
		}
		
		System.out.println(output);
			}
}
