package com.demo;

public class Pattern1 {

	    public static void main(String[] args) {
	        
	        int n=4,s=0;
	        
	        for(int i=n;i>=0;i--)
	        {
	            for(int k=s;k>0;k--)
	            {
	                System.out.print(" ");
	            }
	            
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print("*");
	            }
	            
	            
	            for(int l=i-1;l>0;l--)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	            s=s+1;
	        }
	        
	        
	        

	    }

	}
