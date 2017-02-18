package gaja;

	/*
	************WORD TO NUMBER CONVERTER******************
	**********PROGRAM BY BHUSHAN MANEKAR*****************
	***********************Sample input:*********************************
	*one
	*thousand
	*three
	*hundred
	*thirty
	*three
	*q******************** it is to stop an input
	**************************Output***************************************
	Your entered number is: 1333
	*************************************************************************
	*/
	import java.io.*;

	public class hi{
		int i=1, count=0;
		int j=0,k=0,x=0;
		String arr[] = new String[10];
		hi(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do{
				arr[i]=br.readLine();
				if(arr[i].equals("twenty")) {j=20;x=20;}		if(arr[i].equals("thirty")) {j=30;x=30;}
				if(arr[i].equals("fourty")) {j=40;x=40;}			if(arr[i].equals("fifty")) {j=50;x=50;}
				if(arr[i].equals("sixty")) {j=60;x=60;}			if(arr[i].equals("seventy")) {j=70;x=70;}
				if(arr[i].equals("eighty")) {x=80;j=80;}			if(arr[i].equals("ninety")) {j=90;x=90;}
				if(arr[i].equals("eleven")) j=11;					if(arr[i].equals("twelve")) j=12;
				if(arr[i].equals("thirteen")) j=13;					if(arr[i].equals("fourteen")) j=14;
				if(arr[i].equals("fifteen")) j=15;						if(arr[i].equals("sixteen")) j=16;
				if(arr[i].equals("seventeen")) j=17;				if(arr[i].equals("eighteen")) j=18;
				if(arr[i].equals("nineteen")) j=19;
				if(arr[i].equals("one")) {j=x+1;x=0;}			if(arr[i].equals("two")) {j=x+2;x=0;}
				if(arr[i].equals("three")) {j=x+3;x=0;}			if(arr[i].equals("four")) {j=x+4;x=0;}
				if(arr[i].equals("five")) {j=x+5;x=0;}				if(arr[i].equals("six")) {j=x+6;x=0;}
				if(arr[i].equals("seven")) {j=x+7;x=0;}		if(arr[i].equals("eight")) {j=x+8;x=0;}
				if(arr[i].equals("nine")) {j=x+9;x=0;}			if(arr[i].equals("ten")) {j=x+10;x=0;}

				if(arr[i].equals("thousand")) k=j*1000;
				if(arr[i].equals("hundred")) k=j*100;
				if(arr[i].equals("lack")) k=j*100000;
				if(arr[i].equals("crore")) k=j*10000000;

				count=count+k;
				k=0;
				i++;
			}while(!(arr[i-1].equals("q")));

			if(!(arr[i-2].equals("thousand") || arr[i-2].equals("hundred") || arr[i-2].equals("lack") || arr[i-2].equals("crore")))
				count=count+j;
			System.out.println("Your entered number is : "+count);
			}catch(Exception ex){
				System.out.println("caught an exception");
			}
		}
		public static void main(String args[]) {
		hi a=new hi();
		
		}
	}

