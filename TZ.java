package Interview;

public class TZ {
	
	public int TrailingZeros(int n){
		
		int result =0;
		
		for(int i=5; i<=n; i=i*5) {
			result = result + n/i;
			
		}
	     return result;
	}
	
	

	public static void main(String[] args) {
               TZ obj = new TZ();
               System.out.println(obj.TrailingZeros(125));
	}

}
