import java.util.*;
class IncTax
{
	public static void main(String args[])
	{
		double ctc,tax=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CTC");
		ctc=sc.nextDouble();
		if(ctc>=0 && ctc<=180000)
		tax=0;
		else if(ctc>=180001 && ctc<=300000)
		tax=ctc*10/100;
		else if(ctc>=300001 && ctc<=500000)
		tax=ctc*20/100;
		else if(ctc>=500001 && ctc<=1000000)
		tax=ctc*30/100;
		else
		System.out.println("Invalid Input");
		if(ctc>=0 && ctc<=1000000)
		System.out.println("Tax amount is "+tax);
	}
}