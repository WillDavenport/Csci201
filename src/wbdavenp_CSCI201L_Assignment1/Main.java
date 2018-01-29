package wbdavenp_CSCI201L_Assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import com.google.gson.Gson;

import wbdavenp_CSCI201L_Assignment1.Students;
import wbdavenp_CSCI201L_Assignment1.Response;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		
		BufferedReader br;
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		while(exit == false){
			System.out.print("What is the name of your input file? ");
			String fileName = scan.next();
			String jsonFile = usingBufferedReader(fileName);
			
				//To do, make it get all students
				Response response = new Gson().fromJson(jsonFile, Response.class);

				while(exit == false){
					System.out.println("1) Display Roster");
					System.out.println("2) Add Student");
					System.out.println("3) Remove Student");
					System.out.println("4) Add Grade");
					System.out.println("5) Sort Roster");
					System.out.println("6) Write File");
					System.out.println("7) Exit");
					System.out.print("What would you like to do? ");
					int inp = scan.nextInt();
					if(inp == 1){
						
					}
					else if(inp == 2){
						
					}
					else if(inp == 3){
											
					}
					else if(inp == 4){
						
					}
					else if(inp == 5){
						
					}
					else if(inp == 6){
						
					}
					else if(inp == 7){
						System.out.println("Thanks for using my program!");
						exit = true;
					}
					else System.out.println("Invalid input");
					
				}
				
			 
		}
	}
	
	private static String usingBufferedReader(String filePath)
	{
	    StringBuilder contentBuilder = new StringBuilder();
	    try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
	    {
	 
	        String sCurrentLine;
	        while ((sCurrentLine = br.readLine()) != null)
	        {
	            contentBuilder.append(sCurrentLine).append("\n");
	        }
	    }
	    catch(FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		} catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
	    return contentBuilder.toString();
	}
}
