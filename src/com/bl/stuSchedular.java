package com.bl;

import com.bean.student;

public class stuSchedular {
	private student[] stu = new student[10];
	private int count=0;
	
	public student addStu(int roll, String name)
	{
		student s = viewStu(roll);
		
		if(s == null)
		{
			stu[count] = new student(roll, name);
			count++;
	        return stu[count-1];
	        
		}
		else
		{
			return null;
		}
		
		
	}
	
	public student viewStu(int roll)
	{	
		int i;
		
		for(i=0; i<count; i++)
		{
			if(stu[i].getRoll() == roll)
			{
				return stu[i];
			}
		}
		return null;
		
	}

}
