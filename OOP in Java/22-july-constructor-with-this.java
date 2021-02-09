class Student{
    public int roll_no;
    public String name;
    Student(int r,String n)
    {
        this.roll_no=r;
        this.name=n;
    }
}
public class Main
{
	public static void main(String[] args) {
		Student[] arr = new Student[2];
		arr[0] = new Student(1,"aman");
		arr[1] = new Student(2,"abhinav");
		for(int i=0;i<arr.length;i++)
		System.out.println("Element at i = " + i + " : " + arr[i].roll_no + " " + arr[i].name);
	}
}
