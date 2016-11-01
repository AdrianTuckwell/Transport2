import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CarTest
{
  Car mini;
  Passenger passenger;

  @Before
  public void before()
  {
    mini = new Car("Cooper");
    passenger = new Passenger();
  }

  @Test // 1 --------------------------------
  public void testHasName()
  {
    assertEquals( "Cooper", mini.getName() );
  }

  @Test // 2 --------------------------------
  // test car is empty
  public void testSeatsCount()
  {
    assertEquals( 0, mini.seatsCount() );
  }
  
  @Test // 6 ------------------------------------
  // test when parked car is unloaded
  public void testEmptyWhenParked()
  {
    mini.load(passenger);
    assertEquals( 1, mini.seatsCount() ); 
    mini.park();
    assertEquals( 0, mini.seatsCount() ); 
  }

}

