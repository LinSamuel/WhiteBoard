import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SummingNSeries {

    static HashMap<Integer, Integer> TMap = new HashMap<Integer, Integer>(); //Key is the T value, Value is the corresponding result
    
//    public static int calculateS(BigInteger n){
//        Integer answer = 0;
//        for(BigInteger i = 1; i <= n; i++){
//            Integer val = TMap.get(i);
//            if(val != null){
//                answer += val;
//            } else {
//                TMap.put(i, (i * i) - ((i-1) * (i-1)));
//                val = TMap.get(i);
//                answer += val;
//            }
//        }
//        return answer % 1000000007;
//    }
    
    public static void printStairCase(int n){
    	//StringBuilder currStairs = new StringBuilder();
        //StringBuilder currStairCase = "";
    	
        for(int i = 0; i < n; i++){
        	String stairs = "";
            for(int j = 0; j < n; j++){
                if(j >= n - i - 1){
                    stairs += "#";
                } else {
                	stairs += " ";
                }
                
            }
            System.out.println(stairs);

        }
    }

	public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);        
//        int T = scan.nextInt();
//        for(int i = 0; i < T; i++){
//            int n = scan.nextInt();
//            BigInteger bigN = BigInteger.valueOf(n);
//            //System.out.println(bigN.multiply(bigN).mod(BigInteger.valueOf(1000000007)));
//            System.out.println(bigN.multiply(bigN).mod(BigInteger.valueOf((long)Math.pow(10,9) + 7)));
//        }
		printStairCase(6);
		
		int i = 010;
		int j = 07;
		System.out.println(i);
		System.out.println(j);
		
		int k = 1;
		int L = 2;
		int M = 12;
		
		System.out.println(((k-1)/2) + 1);
		System.out.println(((L-1)/2) + 1);
		System.out.println(((M-1)/2) + 1);
		//System.out.println(k/2);
	}

}
