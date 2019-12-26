package com.sist;
import java.io.*;
import java.util.StringTokenizer;
public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fr=new FileReader("c:\\javaDev\\lotto.txt");
        	StringBuffer sb=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		sb.append(String.valueOf((char)i));
        	}
        	
        	fr.close();
        	
        	String s=sb.toString();
        	//System.out.println(s);
        	int[] lotto=new int[45];
        	String[] ss=s.split("\n");
        	
        	for(String num:ss)
        	{
        		StringTokenizer st=new StringTokenizer(num);
        		while(st.hasMoreTokens()) {
        			String k=st.nextToken();
        			//System.out.println("k="+k);
        			lotto[Integer.parseInt(k)-1]++;
        		}
        	}
        	/*
        	 *  1=11
				2=18
				3=18   ==> 
				4=12(0)
				5=15
				6=14
				7=11
				8=10
				9=16
				10=20(0) (X)
				11=14
				12=25(0)
				13=21  ==>
				14=16
				15=14 (X)
				16=17 (X)
				17=17 (X)
				18=19
				19=20(0)
				20=9
				21=14 (X)
				22=13
				23=11
				24=17
				25=17
				26=18
				27=14 (X)
				28=18
				29=15  ==>
				30=20(0)
				31=17
				32=19
				33=18
				34=17  (X)
				35=13
				36=17
				37=8
				38=25
				39=23  ==>
				40=11
				41=10
				42=21  ==>
				43=23
				44=12(0)
				45=20 (X)

        	 */
        	
        	for(int j=0;j<lotto.length;j++)
        	{
        		//System.out.println((j+1)+"="+lotto[j]);
        	}
        }catch(Exception ex){ex.printStackTrace();}
	}

}





















