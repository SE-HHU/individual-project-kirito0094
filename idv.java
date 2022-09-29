package a1;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.LinkedHashSet;
class ital
{String st;
	int nu;
  public ital(String a,int b)
  {
	  st=a;
	  nu=b;
  }
}

public class idv {
	public static void main(String args[]) throws IOException
	{  
		LinkedHashSet<ital> set=new LinkedHashSet();
		Scanner sc=new Scanner(System.in);
	  System.out.println("请输入题目个数:");
	int n=sc.nextInt();
	sc.close();
		Random r=new Random();
		
		while(set.size()<n)
		{  int a=r.nextInt(2);
		   int b=r.nextInt(2);
		   int c=r.nextInt(2);
		   int num1=r.nextInt(100);
		   int num2=r.nextInt(100);
		   int num3=r.nextInt(100);
		   int answer=0;
		 String str="";
		switch(a)
		{case 0:str=str+num1+"-"+num2;
		   answer=num1-num2;
		   break;
		case 1:str=str+num1+"+"+num2;
		  answer=num1+num2;
		  
		}
		if(b==1)
		 { switch(c)
			{case 0:
				str=str+"-"+num3;
		      answer-=num3;
			break;
			case 1:
				str=str+"+"+num3;
		       answer+=num3;
			 
			}
		 }
		 if(answer<0||answer>=100)
			 continue;
		 str=str+"="; 
		 set.add(new ital(str,answer));
		}
		
		
		BufferedWriter writer1=new BufferedWriter(new FileWriter("D:\\Exercises.txt"));
		BufferedWriter writer2=new BufferedWriter(new FileWriter("D:\\Answers.txt"));
		int j=1;
		for(ital a:set)
		{  writer1.write(j+"."+a.st);
		   writer1.newLine();
		   writer2.write(j+"."+a.nu);
		   writer2.newLine();
			j++;	
		}
		writer1.close();
		writer2.close();
		
	}
	
}
