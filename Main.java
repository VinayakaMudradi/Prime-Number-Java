/******************************************************************************

                            VINAYAKA MUDRADI

*******************************************************************************/

import java.util.Scanner;
class PrimeNumber{
    private long number;
    private void setNumber(long number){
        this.number = number;
    }
    public void getNumber(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        setNumber(s.nextLong());
        s.close();
    } 
    public boolean isPrime(){
        if(this.number == 0 || this.number == 1){
            return false;
        }
        for(long i = 2;i <= this.number/2; i++){
            if(this.number % i == 0){
                return false;
            }
        }
        return true;
    }
}
public class Main
{
	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.getNumber();
		if(pn.isPrime()){
		    System.out.println("True");
		}
		else{
		    System.out.println("False");
		}
		
	}
}

