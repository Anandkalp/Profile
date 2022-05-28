class SayHello
{
	public static void Halo(String name)
	{
		System.out.println("My name is "+name);
	}
	public static void Halo3(char gender)
	{
		System.out.println("My gender is "+gender);
	}
	public static void Halo1(int name)
	{
		System.out.println("My age is "+name);
	}
	public static void main(String args[])
	{
		System.out.println("Main Start");
		Halo("Anand");
		Halo3('M');
		Halo1(28);

		System.out.println("Main End");
	}
}
	