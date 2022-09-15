class Student
{
	
	String name;
	String email;
	String subject;
	
	Student(String s,String n,String m)
	{
	name = s;
	email = n;
	subject = m;
	}
	
	void displayData(String q)
	{
	System.out.println(q+":-"+name+" "+email+" "+subject);
	}
	
	public static void main(String [] args)
	{
	Student s1 = new Student("Raghuveer","Raghuveer@gmail.com","java");
	Student s2 = new Student("ravi","Ravi@gmail.com","python");
	Student s3 = new Student("Rajveer","Rajveer@gmail.com","Javascript");

	s1.displayData("Student 1");
	s2.displayData("Student 2");
	s3.displayData("Student 3");
	
	}
}
