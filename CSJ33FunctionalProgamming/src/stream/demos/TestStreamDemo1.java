package stream.demos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {

		List<Integer> listOfMarks=new ArrayList();
    listOfMarks.add(90);
    listOfMarks.add(30);
    listOfMarks.add(56);
    listOfMarks.add(23);
    listOfMarks.add(8);
    listOfMarks.add(32);
		//I am converting list into Stream
    /*
     * 
     * There ia one more method available in collection called
     *  Stream stream()
     *  
     *  which can be invoked with any valid collection type like list, set, queue
     * 
     * 
     */
   Stream<Integer> s=      listOfMarks.stream();
  //Operation 1: I want to print all the marks of the student who got >=35
   /*
    * Stream<Object> filter(Predicate predicate)
    * 
    * The above method returns new object stream
    * The above method takes Predicate object as parameter
    * Predicate is an functional interface
    * interface Predicate
    * {
    * boolean test(T t);
    * }
    * 
    * filter is one of the non terminal or intermediate method
    * intermediate method invoked or called on stream object and return new stream
    * object
    * 
    * 
    */
 /*  Predicate<Integer> pred=(m)->
   {
	 if(m>=35)
	 {
		 return true;
	 }
	 return false;
   };
   
   listOfMarks.stream().filter(pred).forEach(marks->System.out.println(marks));*/
   listOfMarks.stream().filter(m->m>=35).forEach(m1->System.out.println(m1));
   
   
   
   
   //Operation 2: I want count number passed student and fail student
   
   /*
    * long count()
    *count method is one of the terminal method
    *
    * 
    * 
    */
   
int passedStudent=(int)   listOfMarks.stream().filter(marks->marks>=35).count();

int failCount=(int)listOfMarks.stream().filter(marks->marks<35).count();
System.out.println("The number of passed student is"+ " "+passedStudent );
System.out.println("The number of failed student is"+ " "+failCount );
   //operation 3: I want sort all the marks in ASC and DSC order
/*
 * In Stream api there is one more non-terminal method is available called
 * Stream<Object> sorted()
 * The above sorted() method sorts the stream using 
 * int compareTo(Obejct object) of Comparable interface
 * 
 * There is one more sorted() method is available
 * Stream<Object> sorted(Comparator compator)
 * The above method sorts the stream using 
 * int compare(Object obj1, Object obj2) of Comparator interface
 * 
 * So in stream sorted() is overloaded
 * 
 */
//this will print in  ASC order
listOfMarks.stream().sorted().forEach(m->System.out.println(m));
System.out.println("**********");
//If I want to print in DSC order
Comparator<Integer> cmp=(p1,p2)->
{
	if(p1<p2)
	{
		return 1;
	}
	return -1;
};
listOfMarks.stream().sorted(cmp).forEach(m->System.out.println(m));



   //Operation 4: I want to findout student who got highest marks ald lowest marks

/*
 *Optional<Object> max(Comparator cmp) is the terminal method of Strem API
 *which takes Comparator object as parameter to compare two objects
 *and return Optional object as return type
 *
 *Optional is a container class which is used to check whether value
 *is null or not null 
 *
 *From Optional class if we want to fetch value we use
 * Object get() method 
 */
// int compare(Object 1, Object 2)
System.out.println("****finding max marks******");
Comparator<Integer> maxCmp=(mark1,marks2)->
{
	if(mark1>marks2)
	{
		return 1;
	}
	return -1;
};
int maxMarks=listOfMarks.stream().max(maxCmp).get();
System.out.println(maxMarks);

System.out.println("****finding minimum marks******");
Comparator<Integer> minCmp=(mark1,marks2)->
{
	if(mark1>marks2)
	{
		return 1;
	}
	return -1;
};
int minMarks=listOfMarks.stream().min(minCmp).get();
System.out.println(minMarks);



   //operation 5: I want to count total marks
System.out.println("calculating total marks");
int sum=0;
for(int i=0; i<listOfMarks.size(); i++)
{
	int marks=listOfMarks.get(i);
	sum=sum+marks;
}
System.out.println(sum);
// using stream we want to calculate
/*
 * T reduce(Identity, BinaryOperator) is a terminal method
 * which takes two parameter
 * The first parameter object identity that is nothing but initial value
 * and the second parameter is BinaryOperator, which take two parameter
 * and after processing it return a new result of any type
 * 
 * 
 * 
 */
int total=listOfMarks.stream().reduce(0,(num,m)->num+m);
System.out.println("total marks is"+ " "+total);








   //operation 6: I want to filer those student who got marks >=30 and <35 and
   //I will give 5 grace marks for those students;
    //traditional approach
/*List<Integer> listOfGrace=new ArrayList();
for(int i=0; i<listOfMarks.size(); i++)
{int marks=listOfMarks.get(i);
	if(marks>=30 && marks<35 )
	{
	int res=marks+5;
	listOfGrace.add(res);
	}
}
    System.out.println(listOfGrace);*/
    
System.out.println("calacuting grace marks using stream api");
/*
 * Stream<T> map(Function function)
 * In the above method function is one of the Functional interface
 * interface Function
 * {
 * R apply(T obj)
 * }
 * The map method is intermediate or non-terminal method in stream
 * because it is invoked with stream object and return a new stream object
 * 
 * (T)-> R
 * 
 * 
 * 
 * 
 * 
 */



listOfMarks.stream().
filter(mr->mr>=30&& mr<35).
map(m->

{

int graceMarks=m+5;
String msg="grace marks for" + " "+m + " "+"is"+graceMarks;
return msg;

}).
forEach(m->System.out.println(m));
		

	}

}
