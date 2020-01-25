 import java.util.Scanner;

public class streetFood {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
			int N = s.nextInt();
			int bestProfit = 0;
			for(int i = 0; i < N; i++) {
				int S = s.nextInt()+1;
				int P = s.nextInt();
				int V = s.nextInt();
				int profit = P/S * V;
				if(profit > bestProfit) {
					bestProfit = profit;
				}
			}
			System.out.println(bestProfit);
		}
	}
}
