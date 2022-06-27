/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication39;
import java.util.Scanner;

/**
 *
 * @author Jose Miguel
 */
public class Hanoi {
	Scanner l=new Scanner(System.in);
	String disc[]=new String[8];
	String to1[]=new String[8];
	String to2[]=new String[8];
	String to3[]=new String[8];
	String tor1="Torre 1",tor2="Torre 2",tor3="Torre 3";
	int t1,t2,t3,N;
	String aux;
	public Hanoi(){
		for(int a=0;a<8;a++){
			to1[a]="";
				to2[a]="";
					to3[a]="";
		}
			
	}
	public void AsignarDiscos(int n){
 
	int	c=n,l=n-1;
		if(n==1)
			disc[l]="*";
			else{
			while(c>0){
				if(c==n)
					disc[l]="*";
					else
						disc[l]=disc[l+1]+"**";
					to1[l]=disc[l];
					l--;
					c--;
					
			}	
			}
		
	} 
	public   void verdisco(int n,int origen,int destinno){
			moverndisc(origen,destinno);
		for(int i=N-1;i>=0;i--)
			System.out.printf("%16s \t%16s\t%16s\t\n",to1[i],to2[i],to3[i]);
			
			System.out.printf("%16s \t%16s\t%16s\t\n",tor1,tor2,tor3);
			}
			public void llenartorre1(int n){
					AsignarDiscos(n);
		
			for(int i=n-1;i>=0;i--){
			System.out.printf("%16s \t%16s\t%16s\t\n",to1[i],to2[i],to3[i]);
			
			}
			System.out.printf("%16s \t%16s\t%16s\t\n",tor1,tor2,tor3);
			
			
		
		t1=n-1;
			}
			public void moverndisc(int origen,int destino){
			if(origen==1&&destino==3){
			if(to3[t3]!=""){
					t3++;
						aux=to1[t1];
			to1[t1]=to3[t3];
			to3[t3]=aux;
			if(t1>0)
			t1--;
				}
				else{
				
					aux=to1[t1];
			to1[t1]=to3[t3];
			to3[t3]=aux;
			if(t1>0)
			t1--;
			}
			
			}
			if(origen==3&&destino==1){
			if(to1[t1]!=""){
					t1++;
						aux=to3[t3];
			to3[t3]=to1[t1];
			to1[t1]=aux;
			if(t3>0)
			t3--;
				}
				else{
				
			aux=to3[t3];
			to3[t3]=to2[t2];
			to2[t2]=aux;
			if(t3>0)
			t3--;
			}
		
			}
			if(origen==1&&destino==2){
			if(to2[t2]!=""){
					t2++;
						aux=to1[t1];
			to1[t1]=to2[t2];
			to2[t2]=aux;
			if(t1>0)
			t1--;
				}
				else{
				
					aux=to1[t1];
			to1[t1]=to2[t2];
			to2[t2]=aux;
			if(t1>0)
			t1--;
			}
			
			}
			if(origen==2&&destino==3){
			if(to3[t3]!=""){
					t3++;
						aux=to2[t2];
			to2[t2]=to3[t3];
			to3[t3]=aux;
			if(t2>0)
			t2--;
				}
				else{
				
			aux=to2[t2];
			to2[t2]=to3[t3];
			to3[t3]=aux;
			if(t2>0)
			t2--;
			}
		
			}
			if(origen==2&&destino==1){
			if(to1[t1]!=""){
					t1++;
						aux=to2[t2];
			to2[t2]=to1[t1];
			to1[t1]=aux;
			if(t2>0)
			t2--;
				}
				else{
				
			aux=to2[t2];
			to2[t2]=to1[t1];
			to1[t1]=aux;
			if(t2>0)
			t2--;
			}
			
			}
			if(origen==3&&destino==2){
				if(to2[t2]!=""){
					t2++;
						aux=to3[t3];
			to3[t3]=to2[t2];
			to2[t2]=aux;
			if(t3>0)
			t3--;
				}
				else{
				
			aux=to3[t3];
			to3[t3]=to2[t2];
			to2[t2]=aux;
			if(t3>0)
			t3--;
			}
			
			}
			}
public void Hanoi(int n, int origen,  int auxiliar, int destino){
				
  if(n==1){
  System.out.println("mover disco de " + origen + " a " + destino);
  verdisco(N,origen,destino);
  }
  else{
     Hanoi(n-1, origen, destino, auxiliar);
     
     System.out.println("mover disco de "+ origen + " a " + destino);
     verdisco(N,origen,destino);
     Hanoi(n-1, auxiliar, origen, destino);
     
   }
 }
 public void verhanoi(){
	int n;
        System.out.println("Numero de discos: ");
        N=n = l.nextInt();
        	llenartorre1(n);
        Hanoi(n,1,2,3); 
}

}


