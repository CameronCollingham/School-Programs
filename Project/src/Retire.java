
public class Retire {
	/**
	 * this program takes a starting balance, monthly contribution, return rate,
	 * rate of inflation, and years until retirement and outputs a balance through
	 * out in a table written by Cameron Collingham
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		double starting = Double.parseDouble(args[0]);
		double monthly = Double.parseDouble(args[1]);
		double rateOfReturn = Double.parseDouble(args[2]);
		double inflation = Double.parseDouble(args[3]);
		int retirement = Integer.parseInt(args[4]);
		int numMonths;
		double thisMonths;
		double adjustedRate;
		double total = 0;
		double monthlyAdjusted;
		double roundedThisMonths;

		adjustedRate = ((1 + rateOfReturn) / (1 + inflation)) - 1;
		monthlyAdjusted = adjustedRate / 12;
		
		

		System.out.println("Month		Interest		Balance");
		numMonths = retirement * 12;
		for (int i = 1; i <= numMonths; i++) {
			thisMonths = Math.round((starting * monthlyAdjusted) * 100);
			roundedThisMonths = thisMonths / 100;
			starting += monthly + roundedThisMonths;
			System.out.printf(i + "		$	%.2f	$	%.2f\n", roundedThisMonths, starting);
			total += roundedThisMonths;
		}
		System.out.printf("Total Interest Earned: $  %.2f\nTotal Nest Egg: $ %.2f", total, starting);
	}

}
