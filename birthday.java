import java.util.*;

class birthday{
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int year=scan.nextInt();
    
    if(year %4 ==0){
    
    	if(year % 100==0){
    
    		if(year % 400==0){
    		System.out.println("Vicky can celebrate his birthday.");
    		}
    	}
    }
    
	else {
    	System.out.println("Vicky can't celebrate.");
    	}
    
    }
  }
