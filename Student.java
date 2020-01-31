package Array;

class Student
{
	int rollno,marks;
	String name;
	public Student(int rollno, int marks, String name) 
	{
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String toString()
	{
		return "Student Information [Roll no= "+rollno+" Name= "+name+" Marks= "+marks+"]";
	}
}