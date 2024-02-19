package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to student management ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exit app");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				// add
				System.out.println("Enter user name");
				String name = br.readLine();
				
				System.out.println("Enter phone");
				String phone = br.readLine();
				
				System.out.println("Enter user city");
				String city = br.readLine();
				
				Student st = new Student(name, phone, city);
				
				  boolean ans = StudentDao.insertStudentToDB(st);
				 if(ans)
				 {
					 System.out.println("Student added");
				 }else
				 {
					 System.out.println("Something went wrong");
				 }
				System.out.println(st);
				
			}else if(c==2)
			{
				// delete
				System.out.println("Enter id to delete");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if(f)
				{
					System.out.println("Deleted ");
				
				}
				else {
					System.out.println(" Something went wrong");
				}
				
				
				
			}else if(c==3)
			{
				// display
				StudentDao.showAllStudent();
				
			}else if(c==4)
			{
				//exit
				break;
			}
			else {
				
				System.out.println("Update to be done");
			}
			
			System.out.println("Thankyou ");
		}
	}

}
