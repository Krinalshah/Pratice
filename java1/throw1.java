class abc
{
  public static void vote(int age)
  {
     if(age<18)
     {
        throw new ArithmeticException("Person is not validate for voting");
     }
     else
     {
        System.out.println("Person is not validate to vote");
     }
     
  }
}
class throw1
{
  public static void main(String args[])
  {
    abc.vote(13);
  }
}