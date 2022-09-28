package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe 


{
		static final String projectFilesPath="C:\\Users\\DELL\\eclipse-workspace";
		public static void displayMenu()
		{
			System.out.println("**********************************************");
			System.out.println("\tWelcome to LockedMe.com secure app");
			System.out.println("\tDeveloped by : Javadeveloper123");
			System.out.println("**********************************************");
			System.out.println("\t\t1. Display all the files");
			System.out.println("\t\t2. Add a new file");
			System.out.println("\t\t3. Delete a file");
			System.out.println("\t\t4. Search files");
		}
		
		public static void getAllFiles() 
		{
			File folder = new File(projectFilesPath);
			File[] listofFiles = folder.listFiles();

			if(listofFiles.length>0)
			{
				System.out.println("Files list is displayed below:\n");
				for(var l:listofFiles)
				{
					System.out.println(l.getName());
				}
			}
			else
			{
				System.out.println("The folder is empty");
			}
		}
		public static void createFiles()
		{

			try
			{
				Scanner obj = new Scanner(System.in);
				String fileName;
				System.out.println("Enter the file name");
				fileName=obj.nextLine();

				int linesCount;
				System.out.println("Enter how many lines in the file:");
				linesCount=Integer.parseInt(obj.nextLine());

				FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName);
				for(int i=1;i<=linesCount;i++)
				{
					System.out.println("Enter file line: ");
					fw.write(obj.nextLine()+"\n");

				}
				System.out.println("file created successfully");
				fw.close();
			}
			catch (Exception e) 
			{
				// TODO: handle exception
			}

		}
		public static void deleteFiles()
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the file name: ");
			fileName=obj.nextLine();
			File f = new File(projectFilesPath+"\\"+fileName);
			if(f.exists())
			{
				f.delete();
				System.out.println("File deleted successfully");
			}
			else 
			{
				System.out.println("file does not exist");
			}
		}
		public static void searchFiles()
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Search files");
			fileName=obj.nextLine();
			File f = new File(projectFilesPath+"\\"+fileName);
			if(f.exists())
			{
				System.out.println("your search is here:");
			}
			else
			{
				System.out.println("The folder not found");
			}
		}

		
}
