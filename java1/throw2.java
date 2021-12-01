class UserDefinedException extends Exception
{
  public UserDefinedException(String str)
 {
   super(str);
 }
}
class throw2
{
  public static void main(String args[])
  {
     try
     {
        throw new UserDefinedException("This is user defined exceptions");
     }
     catch(UserDefinedException ude)
    {
        System.out.println("Caught the exception");
        System.out.println(ude.getMessage());
    }
  }
}
 