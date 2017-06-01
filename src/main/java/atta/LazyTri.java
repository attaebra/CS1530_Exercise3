package atta;

public class LazyTri {
	public static void main(String[] args) {
		int num = 0;
		
		try{
			num = Integer.parseInt(args[1]);
			if(num < 0){
				System.out.println("You must enter a positive integer.");
				System.exit(0);
			}
		}catch (NumberFormatException e) {
			System.out.println("You must enter a valid integer.");
			System.exit(0);
		}
		
		if (args[0].equalsIgnoreCase("triangle")){
			System.out.printf("Triangle(%d) = %d", num, triangleSeq(num));
		}
		
		if (args[0].equalsIgnoreCase("lazy")){
			System.out.printf("Lazy(%d) = %d", num, lazySeq(num));
		}
	}
	
	public static int triangleSeq(int n){
		if(n > 0) return n + triangleSeq(n - 1);
		else return 0;
	}


	public static int lazySeq(int n){
		return (n * n + n + 2) / 2;
	}
}