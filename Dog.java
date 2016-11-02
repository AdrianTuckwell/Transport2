class Dog implements Talking
{
  private String name;

  public Dog(String name)
  {
    this.name = name;
  }

  public String speak() 
  {
    return "barking";
  }

  public String getName() 
  {
    return this.name;
  }

}