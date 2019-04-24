import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLExpSimple {
	
	public static void main(String[] args){
		try{
			URL mysite = new URL("https://github.com/alexlepore?tab=repositories");
			URLConnection git_hubs = mysite.openConnection();
			Scanner in = new Scanner(new InputStreamReader(git_hubs.getInputStream()));
			int count = 0;
			while (in.hasNext()) {
				System.out.println(in.next());
				count++;
			}
			System.out.println("Number of tokens: " + count);
			in.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
