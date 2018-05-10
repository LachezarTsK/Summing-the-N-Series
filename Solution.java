import java.util.*;
import java.math.*;

public class Solution {

 		public static void main(String[] args) {
		getResults();
	}

	public static void getResults() {

		ArrayList<BigInteger> list = inputIntegers();
		BigInteger modValue = BigInteger.valueOf((long) Math.pow(10, 9) + 7);

		if (list != null && !list.isEmpty()) {
			for (BigInteger bigInt : list) {
				
				System.out.println(bigInt.pow(2).mod(modValue));
			}
		}
	}

	public static ArrayList<BigInteger> inputIntegers() {

		Scanner reader = new Scanner(System.in);
		int cases = reader.nextInt();
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();

		if (cases >= 1 && cases <= 10) {
			int counter = 0;
			while (counter < cases) {
				BigInteger input = reader.nextBigInteger();
				if (input.compareTo(BigInteger.ONE) >= 0 && input.compareTo(new BigInteger("10").pow(16)) <= 0) {
					list.add(input);
					counter++;
				} else {
					return null;
				}
			}
		}
		return list;
	}
}
