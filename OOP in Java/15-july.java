/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Dog
{
    String breed;
    String size;
    int age;
    String color;
    
    // method 1
    public String Info(){
        return ("Breed is:" + breed);
    }
}
    public class Main {
	public static void main(String[] args) {
	    Dog maltese = new Dog();
	    maltese.breed="werewolf";
		System.out.println(maltese.Info());
	}
}
