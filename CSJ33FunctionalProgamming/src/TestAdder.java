
interface Adder
{
	int add(int a, int b);
}


public class TestAdder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Adder a= (n1,n2)->  n1+n2;;
int res=a.add(10, 20);
System.out.println(res);
	}

}
