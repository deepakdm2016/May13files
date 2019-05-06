import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class numberOfWords_file {

	public static void main(String v[]) throws IOException
	{
		
		File input=new File("C:\\Users\\Deepak\\output.txt");
		FileInputStream fs=new FileInputStream(input);
		InputStreamReader isr=new InputStreamReader(fs);
		BufferedReader br=new BufferedReader(isr);
		String line;
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Deepak\\output1.txt");

		/*for file writing
		int data=0;
		while((data=fs.read())!=-1)
		{
			fos.write(data);
		}
		file copy ends
		*/
		
		int wordCount=0;
		int sentCount=0;
		while((line=br.readLine())!=null)
		{
		
			String s[]=line.split(" ");
			wordCount=wordCount+s.length;
			
			for(String s1:s)
			{
				System.out.println(s1);
			}
			
			String sentence[]=line.split("[.?!]+");
			sentCount=sentCount+sentence.length;
			for(String sent:sentence){
				System.out.println(sent);
			}
		
		
		}
		
		System.out.println(wordCount);
		System.out.println(sentCount);

		
		
		
		br.close();
		isr.close();
		fs.close();

	}
}
