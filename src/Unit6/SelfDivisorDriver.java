package Unit6;

public class SelfDivisorDriver {
	public static void main (String[] args)
	   {
		 SelfDivisor sd = new SelfDivisor();
	     System.out.println("Self divisors for firstNumSelfDivisors(10, 3):");
	     for (int n : sd.firstNumSelfDivisors(10, 3))
	        System.out.print(n + " ");
	     System.out.println();

	     System.out.println("Self divisors for firstNumSelfDivisors(22, 5)");
	     for (int n : sd.firstNumSelfDivisors(22, 5))
	        System.out.print(n + " ");
	     System.out.println();
	   }
}