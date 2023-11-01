package com.devops.SampleArth;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter two numbers:");
    	int x=sc.nextInt();
    	int y=sc.nextInt();
        Add a=new Add();
        System.out.println(a.add(x,y));
        Subn s=new Subn();
        System.out.println(s.sub(x,y));
        Mult m=new Mult();
        System.out.println(m.mul(x,y));
        Divn d=new Divn();
        System.out.println(d.divn(x,y));
    }
}