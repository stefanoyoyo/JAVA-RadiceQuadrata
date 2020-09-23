import java.util.*;

public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		while (true)
		{
			System.out.println("\n-----SQUARE CALCULATOR-----\n");
			System.out.print("\n\nQuesta app compie il calcolo\n" +
							 "della radice quadrata. Per favore, inserisci\n" +
							 "un numero:");

			Scanner input = new Scanner(System.in);
			long number = input.nextLong();
			long radiceQuadrata = getRadiceQuadrata(number);
			double radicePrecisa = getRadiceQuadrataDecimal(number);
			System.out.println("La radice di " 
							   + number + " vale " + radiceQuadrata);
			System.out.println("La radice precisa di " 
							   + number + " vale " + radicePrecisa);
			Thread.sleep(1000);
		}

	}

	// Metodo per il calcolo manuale della radice
	// di numeri interi.  
	// <returns>La radice del numero richiesto</returns>
	private static long getRadiceQuadrata(long number)
	{
		long radiceQuadrata = -1;
		long count = 0;
		while ((count * count) < number)
		{
			++count;
			radiceQuadrata = count;
		}
		return radiceQuadrata;
	}

	// Metodo per il calcolo manuale della radice
	// di numeri interi.  
	// <returns>La radice del numero richiesto</returns>
	private static double getRadiceQuadrataDecimal(long number)
	{
		try 
		{
			double radiceQuadrata = -1;
			double count = 0;
			while ((count * count) < number)
			{
				count+= 0.001;
				radiceQuadrata = count;
			}
			return radiceQuadrata;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return -1;
		}
	}
}
