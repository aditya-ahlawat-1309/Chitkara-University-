class data{
    int a,b;
    data(int x, int y)
    {
        a=x;
        b=y;
    }
}
public class Main
{
	public static void main(String[] args) {
		data[] obj = new data[2];
		obj[0] = new data(10,20);
		obj[1] = new data(30,40);
		for(int i=0;i<2;i++)
		System.out.println(obj[i].a + " " + obj[i].b);
	}
}
