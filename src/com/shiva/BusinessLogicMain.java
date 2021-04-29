package com.shiva;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessLogicMain implements OperationFilesInterface {
	Scanner input = new Scanner(System.in);
	List<String> load = new ArrayList<String>();

	File files = new File("C:\\Users\\Admin\\eclipse-workspace\\LockedMe\\files");
	File[] fileList = files.listFiles();

	@Override
	public void showFiles() {
		for(File file:fileList) {
			if(file.isFile()) {
				load.add(file.getName());
			}
			load.forEach(System.out::print);
		}
	}

	@Override
	public void addFile() {
		  System.out.println("Please Enter the file which you want to add :");
		  String fileName = input.next();
		  File f = new File(fileName);
		  try {
			  if(f.createNewFile()) {
				  System.out.println(fileName+" File is created ");
				  Desktop.getDesktop().edit(f);
			  }
			  else {
				  System.out.println("File is already Exists");
			  }
		  } catch (IOException e) { e.printStackTrace(); }

	}

	@Override
	public void deleteFile() {
		 System.out.println("Please Enter the file which you want to delete :");
		  String fileName = input.next();
		  File f = new File(fileName);
		  if(f.delete()) {
			  System.out.println("File is deleted Succesfully ");
		  }
		  else {
			  System.out.println("No Such file is present to delete");
		  }


	}

	@Override
	public void searchFile() {
		try {	
			Scanner scan= new Scanner(System.in);
			File directory = new File("C:\\Users\\Admin\\eclipse-workspace\\LockedMe\\files");
			System.out.println("Enter the file name which you want to search:");
			String fileName=scan.nextLine();
            File[] files=directory.listFiles();
            int flag=0;
            for (File file : files) {
                String name = file.getName();
                if (name.equals(fileName)) {
                        System.out.println("The filename "+fileName+" is present in the directory");
        				File f= new File(fileName);
        				Scanner sc1 = new Scanner(f);
        				while(sc1.hasNextLine()) {
        				System.out.println(sc1.nextLine());
        				}
        			flag=1;	
                }
			}
        if(flag==0) {
        	System.out.println("File not found");
        }
        	
		}catch(FileNotFoundException ex) {
			System.out.println("file not found");
		}
		
	}


	}


 
