/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Addition
{

    int a,b,sum;
    
    // method 1
    public void Info(){
        System.out.println(sum);
    }
}
    public class Main {
	public static void main(String[] args) {
	    Addition obj1 = new Addition();
	    Addition obj2 = new Addition();
		obj1.a=10;
		obj1.b=20;
		obj2.a=8;
		obj2.b=7;
		obj1.sum=obj1.a+obj1.b;
		obj2.sum=obj2.a+obj2.b;
		obj1.Info();
		obj2.Info();
	}
    
}
