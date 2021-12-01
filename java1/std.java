class std{
	private int roll;
	public int getroll()
	{
		return roll;
	}
	public void setroll(int roll)
	{
		this.roll=roll;
	}
	public void display()
	{
		System.out.println("roll no is "+ roll);
	}
	public static void main(String[] args)
	{
		std obj=new std();
		obj.getroll();
		obj.setroll(43);
		obj.display();
	}
}
		