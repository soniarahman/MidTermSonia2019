package math.problems;
/*
 * Find list of Prime numbers from number 2 to 1 million.
 * Try the best solution as possible.Which will take less CPU life cycle.
 * Out put number of Prime numbers on the given range.
 *
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 *
 */

public class PrimeNumber {
	//prime number is divisable by 1 & itself so if i = 1, n = 2, prime = n%n && n%1 ,( 2%2 && 2%1 = prime)

	public static void main(String[] args) {

		{
			int i =0;
			int num =0;

			String  primeNumbers = "";

			for (i = 1; i <= 100000; i++)
			{
				int counter=0;
				for(num =i; num>=1; num--)
				{
					if(i%num==0)
					{ counter = counter + 1;
					}
				}
				if (counter ==2)
					primeNumbers = primeNumbers + i + " ";
			}
			System.out.println("Prime numbers from 2 to 1 millions are :");
			System.out.println(primeNumbers);


		}
	}
	}


