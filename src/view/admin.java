package view;

import java.util.Scanner;

import com.bean.student;
import com.bl.stuSchedular;

public class admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		stuSchedular ss = new stuSchedular();
		
		int choice;
		student stu;
		int roll;
		String name;
		int i;
		
		while(true)
		{
			System.out.println("Enter your choice\n1:Add Student\n3:Search Student\n4:Exit\n");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Roll No");
				roll = sc.nextInt();
				System.out.println("Enter Name");
				name = sc.next();
				stu = ss.addStu(roll, name);
				
				if(stu==null)
				{
					System.out.println("Student already exist");					
				}
				else
				{
					System.out.println("Student Added");
					System.out.println("Number of courses");
				    int num = sc.nextInt();
				    String[] course = new String[num];
				
				    for(i=0; i<course.length; i++)
				    {
					    course[i] = sc.next();
				    }
				}
				
				break;
				
			case 3:
				System.out.println("Enter the Roll no you want");
				roll = sc.nextInt();
				stu = ss.viewStu(roll);
				
				if(stu!=null)
				{
					System.out.println(stu.getRoll() + "     " + stu.getName());
					for(i=0; i<stu.getCount(); i++)
					{
						System.out.println(stu.getCor()[i]);
					}
				}
				else
				{
					System.out.println("No Student Found");
				}
				break;
				
			case 4:
				System.out.println("Thank You!");
				sc.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Wrong Choice\nPlease try again...");
			}
		}

	}

}
