package democlass;
class pack
{
   public static void main(String args[])
   {
        System.out.println("package demo");
        pack obj=new pack();
        obj.show();
   }
   protected void show()
   {
        System.out.println("protected class can be accessed");
   }
}   