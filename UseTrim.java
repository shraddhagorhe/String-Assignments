package profound.string;

import java.io.*;

public class UseTrim {

	public static void main(String[] args) 
	
		throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			System.out.println("Enter stop to quit");

			System.out.println("Enter state :");
			
			do {
				str=br.readLine();
				str=str.trim();
				if(str.equals("Illinois"))
					System.out.println("Capital is a Springfield.");
				else if(str.equals("Missouri"))
				
				System.out.println("Capital is a Jefferson city");
				else if(str.equals("California"))
				
				System.out.println("Capital is a Sacramento.");
			   else if(str.equals("Washington"))
				   
				System.out.println("Capital is a Olympia.");	
				
			}while(!str.equals("stop"));

		}			
	}

