import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.*;

public class CarTest
{
  Car mini;
  Passenger passenger;
  Dog dog;

  @Before
  public void before()
  {
    mini = new Car("Cooper");
    passenger = new Passenger();
    dog = new Dog("Harvey");
  }

  @Test // 1 --------------------------------
  public void testHasCarName()
  {
    assertEquals( "Cooper", mini.getName() );
  }

  @Test // 2 --------------------------------
  // test car is empty
  public void testSeatsCount()
  {
    assertEquals( 0, mini.seatsCount() );
  }
  
  @Test // 3 ------------------------------------
  // test when parked car is unloaded
  public void testEmptyWhenParked()
  {
    mini.load(passenger);
    assertEquals( 1, mini.seatsCount() ); 
    mini.park();
    assertEquals( 0, mini.seatsCount() ); 
  }

  @Test // 4 ------------------------------------
  public void canPassengerSpeak()
  {
    assertEquals("speaking", passenger.speak());

  }

  @Test // 5 ------------------------------------
  public void canDogSpeak()
  {
    assertEquals("barking", dog.speak());

  }

  @Test // 6 --------------------------------
  public void testHasDogName()
  {
    assertEquals( "Harvey", dog.getName() );
  }

}

