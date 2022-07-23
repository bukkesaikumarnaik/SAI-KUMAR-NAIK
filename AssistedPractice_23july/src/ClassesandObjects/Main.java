package ClassesandObjects;

//Abstraction program

abstract class Bank1
{    
abstract int getInterestRate();    
}    
//concrete class
class HDFC extends Bank1
{    
int getInterestRate(){return 5;}    
}
//concrete class
class HSBC extends Bank1
{    
int getInterestRate(){return 4;}    
}    
 
class Main
{    
    public static void main(String args[])
    {    
        Bank1 b1;  
        b1 = new HDFC ();      // concrete class object
        System.out.println("HDFC Rate of Interest is: "+b1.getInterestRate()+"%");    
        b1 = new HSBC ();        // concrete class object
        System.out.println("HSBC Rate of Interest is: "+b1.getInterestRate()+"%");    
    }
}    