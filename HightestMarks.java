package Array;
/*
23. Create  Student  class having rollno,name,marks.Create  10 objects .
Using Array of Objects display information of student who got highest marks.
*/

public class HightestMarks
{
	public static void main(String[] args) 
	{
		Student ob[] =  new Student[10];
		ob[0]=new Student(1,89,"Unnati");
		ob[1]=new Student(2,90,"Rinku");
		ob[2]=new Student(3,80,"Yash");
		ob[3]=new Student(4,79,"Uchita");
		ob[4]=new Student(5,99,"Rgini");
		ob[5]=new Student(6,70,"Dipali");
		ob[6]=new Student(7,69,"Preana");
		ob[7]=new Student(8,66,"Anjali");
		ob[8]=new Student(9,81,"Sammi");
		ob[9]=new Student(10,83,"Sayali");
		System.out.println(ob[0]+"\n"+ob[1]+"\n"+ob[2]+"\n"+ob[3]+"\n"+ob[4]+"\n"+ob[5]
				+"\n"+ob[6]+"\n"+ob[7]+"\n"+ob[8]+"\n"+ob[9]);
		int x = 0,c=0;
		for(int i=0;i<ob.length-1;i++)
		{
			x=ob[0].getMarks();
			
			if(x<ob[i].getMarks())
			{
				x=ob[i].getMarks();
				c=i;
			}
		}
		System.out.println("\nStudent having greter Marks \n"+ob[c]);
	}
}
