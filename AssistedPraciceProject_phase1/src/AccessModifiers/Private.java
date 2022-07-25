package AccessModifiers;

 class Private 
{

	private void display()
	    {
	        System.out.println("HI SAI KUMAR WELCOME TO JAVA WORLD");
	    }

	 
	public static void main(String args[])
	    {
	        Private obj = new Private();
	        // Trying to access private method
	        // of another class
	        obj.display();
	    }
}