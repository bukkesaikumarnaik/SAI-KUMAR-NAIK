package ClassesandObjects;
//Polymorphism Program

public class Sum 
{
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        System.out.println(s.sum(50,30 )); 
        System.out.println(s.sum(50, 20, 30)); 
        System.out.println(s.sum(50.5, 30.5)); 
    } 
}



