import java.util.*;

public class Car
{
  private String name;
  private ArrayList<Passenger> seats;

  // ------------------------------------
  public Car(String name)
  {
    this.name = name;
    this.seats = new ArrayList<Passenger>();
  }

  //-------------------------------------
  public String getName()
  {
    return this.name;
  } 

  // ------------------------------------
  public int seatsCount()
  {
    return this.seats.size();
  }

  // ------------------------------------
  public void load(Passenger passenger) 
  {
    this.seats.add(passenger);
  }

  public void park()
  {
    this.seats.clear();
  } 
}