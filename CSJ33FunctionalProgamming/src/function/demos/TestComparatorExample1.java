package function.demos;

import java.util.Comparator;

public class TestComparatorExample1 {

	public static void main(String[] args) {
// compare(Object obj1, Object obj2)
Comparator<Integer> cmp=(obj1, obj2)->
{
if(obj1> obj2)
{
	return 1;
}
return -1;
};
	int status=cmp.compare(5,10);	
	System.out.println(status);
		
		
		

	}

}
