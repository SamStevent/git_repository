package sam.demo;
import java.util.Scanner;


public class Main {
	public static void solution(String str1,String str2){
		int len1=str1.length();
		int len2=str2.length();
		int i=0,j=0;
		int count=0;
		boolean[] flags=new boolean[len1];
		for (i = 0; i < len2; i++) {
			int k=j;
			while(k<len1&&str1.charAt(k)!=str2.charAt(i))++k;
			if (k<len1) {
				count+=k-j;
				j=k+1;
			}else {
				count++;
			}
		}
		count+=len1-j;
		System.out.println(count);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			String str1=scanner.next();
			String str2=scanner.next();
			solution(str1,str2);
		}
	}

}
