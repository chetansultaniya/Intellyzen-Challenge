import java.util.Arrays; 
import java.util.Scanner;

public class Intellyzen 
{ 
	public static void main(String[] args) 
	{ 
	  	Scanner sc = new Scanner(System.in); 
        int Test=0,N=0;
		System.out.println("Enter Number of Test Cases");
        Test = sc.nextInt();
       
        for(int i=0;i<Test;i++)
        {
             N=0;
			 System.out.println("Enter Number of People for Case :"+(i+1));
             N = sc.nextInt();
             long[] A = new long[N];
             for(int j=0;j<N;j++) 
                A[j] = sc.nextInt();
             Arrays.sort(A);
             long cost=0;
             while(N>3)
             {
			   long min = Math.min(A[0]+ (2*A[1])+A[N-1],(2*A[0])+A[N-1]+A[N-2]);
               cost= cost+min;
               N=N-2;
             }
             if(N==3)
			 {
				cost=cost+A[0]+A[1]+A[2];
			 }
             else if(N==2)
			 {
				cost=cost+A[1];
			 }
             else
			 {
				 cost=cost+A[0];
			 }
            
        	 System.out.println("Minimun cost required = "+cost);
       
	  }
	   
	} 
} 