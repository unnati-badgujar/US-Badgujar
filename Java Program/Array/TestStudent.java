package Array;

import java.util.Scanner;

class Student_
{
	private int PhyMarks,CheMarks,MathMarks;
	public Student_(int PhyMarks,int CheMarks,int MathMarks) 
	{
		this.PhyMarks=PhyMarks;
		this.CheMarks=CheMarks;
		this.MathMarks=MathMarks;
	}
	public int getPhyMarks() 
	{
		return PhyMarks;
	}
	public void setPhyMarks(int phyMarks) 
	{
		PhyMarks = phyMarks;
	}
	public int getCheMarks() 
	{
		return CheMarks;
	}
	public void setCheMarks(int cheMarks) 
	{
		CheMarks = cheMarks;
	}
	public int getMathMarks() 
	{
		return MathMarks;
	}
	public void setMathMarks(int mathMarks) 
	{
		MathMarks = mathMarks;
	}	
	public String toString()
	{
		return "Physi";
		jdftyhg
	}
}
public class TestStudent 
{
	public static void main(String[] args) 
	{
		Student_ std[]= new Student_[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			System.out.println("Enter Marks of\nPhysics Chemistry Math");
			std[i]= new Student_(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		for(int i=0;i<std.length;i++)
		{
			System.out.println(std[i]);
		}
	}
}
