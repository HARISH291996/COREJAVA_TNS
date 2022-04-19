package com.equal;

public class EqualsDemo2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String s1=new String ("HARISH");
        String s2=new String ("HARISH");
        String s3=null;
        String s4=new String ("HARISH");
        
        System.out.println("s1 and s4 are equal= "+(s1==s4));
        System.out.println("s1 and s4 are equal= "+s1.equals(s4));
        
        s1=s4;
        System.out.println("s1 and s4 are equal= "+(s1==s4));
        System.out.println("------------------------------------------");
        System.out.println("s1 and s2 are equal= "+s1.equals(s2));
        System.out.println("s1 and s3 are equal= "+s1.equals(s3));
        System.out.println("s1 and s4 are equal= "+s1.equals(s4));
	}

}