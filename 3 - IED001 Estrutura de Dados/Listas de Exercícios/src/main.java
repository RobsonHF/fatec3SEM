
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = rec(4);
		System.out.println(n);
		

	}
	public static int rec (int n) {
		if (n == 1) return 1;
		return rec(n-1) + rec(n-1) + rec(n-1) + 1;
}
}