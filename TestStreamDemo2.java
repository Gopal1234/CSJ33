package stream.demos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Flight
{
	private int flightNumber;
	private String flightName;
	private String flightSource;
	private String flightDestination;
	private double flightCost;
	public Flight(int flightNumber, String flightName, String flightSource, String flightDestination,
			double flightCost) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
		this.flightCost = flightCost;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public double getFlightCost() {
		return flightCost;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", flightSource=" + flightSource
				+ ", flightDestination=" + flightDestination + ", flightCost=" + flightCost + "]";
	}
	
}//close the flight class
class FlightService
{
Set<Flight> flights;
int i;
public void addFlight(Set<Flight> flights)
{  
	this.flights=flights;
	 ++i;
	System.out.println( i+" "+"flight added");
}
public Stream<Flight> getFlights()
{
	//converting set into stream
Stream<Flight> newStream=	flights.stream();
return newStream;
}
public List<Flight> searchFlights(String source, String destination)
{
	
List<Flight> resFlight=	flights.stream().
	filter(flight->
	flight.getFlightSource().equals(source) 
	&& flight.getFlightDestination().equals(destination)).
	collect(Collectors.toList());
	return resFlight;
}
public Flight getFlightByNumber(int flightNumber)
{
	Flight flightObj=flights.stream().
			filter(flight-> flight.getFlightNumber()==flightNumber).
			findAny().get();
	return flightObj;
}
public Stream<Flight> getSortedFlight()
{
	Comparator<Flight> cmp=(flight1,flight2)->
	{
		if(flight1.getFlightCost() >flight2.getFlightCost())
		{
			return 1;
		}
		return -1;
	};
	
	
Stream<Flight> newStream=	flights.stream().sorted(cmp);
	return newStream;
}
public Flight getMaxPrice()
{
	Comparator<Flight> maxCmp=
			(f1,f2)->f1.getFlightCost()>f2.getFlightCost()?1:-1;
			
Flight flight=	flights.stream().max(maxCmp).get();
return flight;
}


public void removeFlight(int flightNumber)
{
	/*
	 * boolean removeIf(Predicate predicate)
	 * The above method defined inside collection framework
	 * to remove any object from any type of collection based on the
	 * given predicate reference
	 * 
	 * interface Predicate
	 * {
	 * boolean test(T t)
	 * }
	 * 
	 */
boolean status=	flights.
removeIf(f->f.getFlightNumber()==flightNumber);
if(status)
{
	System.out.println("flight removed successfully");
}
else
{
	System.out.println("not removed");
}
}






	
}//close of FlightService class
public class TestStreamDemo2 {

	public static void main(String[] args) {
		/*I will create object of FlightService because in Flight
		 * Service class all methods are non-static or object dependent
		 * 
		 * to call addFlight(Set<Flight> flight)
		 * I need to create one object of Set  
		 */
  FlightService service=new FlightService();
  Set<Flight> setOfFlight=new HashSet();
  Scanner sc=new Scanner(System.in);
  System.out.println("How many flight do you want to add");
  int nof=sc.nextInt();
  for(int i=0; i<nof; i++)
  {
	  System.out.println("enter flight number");
	  int flightNo=sc.nextInt();
	  System.out.println("enter flight name");
	  String flightName=sc.next();
	  System.out.println("enter flight source");
	  String flightSource=sc.next();
	  System.out.println("enter flight destination");
	  String flightDestination=sc.next();
	  System.out.println("enter flight price");
	  double price=sc.nextDouble();
	  Flight flightObj=new Flight(flightNo, flightName, 
			  flightSource, flightDestination, price);
	  
	  setOfFlight.add(flightObj);
	  
}//close for loop
	//calling addFlight(Set<Flight> setOfFlight)
  service.addFlight(setOfFlight);
  //calling getFlights() method
  
  Stream<Flight> resultStream=  service.getFlights();
  resultStream.forEach(flight->System.out.println(flight));
 /* System.out.println("enter flight source location");
  String src=sc.next();
  System.out.println("enter flight destination location");
  String dest=sc.next();
  //calling searchFlight(src,dest)
 List<Flight> searchedFlights= service.searchFlights(src, dest);
  
 //iterating the result list
 searchedFlights.forEach(f->System.out.println(f));*/
 
 
 //calling getFlightByNumber()
// Flight f=service.getFlightByNumber(1234);
 //System.out.println(f);
 System.out.println("after sorting flight based on price");
  Stream<Flight> resultSortedStream= service.getSortedFlight();
 resultSortedStream.forEach(f1->System.out.println(f1));
 
 //calling getMaxFlight()
 Flight f=service.getMaxPrice();
 System.out.println(f);
 
 service.removeFlight(1234);
 
 
 
	}

}
