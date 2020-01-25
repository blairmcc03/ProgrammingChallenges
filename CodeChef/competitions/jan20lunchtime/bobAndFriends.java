import java.util.Scanner;


class bobAndFriends {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t  = s.nextInt();
		while(t-- > 0) {
			int n = s.nextInt();
			long alice = s.nextLong();
			long bob = s.nextLong();
			long changingTime = s.nextLong();
		    long minDiff = Long.MAX_VALUE;
			while(n-- > 0){
				long b = s.nextLong();
				if(Math.abs(b-bob) + Math.abs(b-alice)< minDiff) {
					minDiff = Math.abs(b-bob) + Math.abs(b-alice);
				}
			}
			long totaltime = changingTime + minDiff;
			System.out.println(totaltime);
		}

	}

}
