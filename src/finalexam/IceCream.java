/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexam;

/**
 *
 * @author johnc
 */
public class IceCream 
{
    // private fields created 
    private String flavor;
    private String size;
    private int count;
    
    /*
    Default constructor when created will have 3 arugements that will
    be assigned to the private fields flavor, size, count.
    */
    
    public IceCream(String flavor, String size, int count)// accepts 3 arugemnts
    {
        this.flavor = flavor; //this. represent the class field 
        this.size = size;
        this.count = count;
    }
    
    /*
    Copy constructor when called will copy all of the inner fields from the
    the object that it copyied.
    */
    public IceCream(IceCream copy) // accepts an obj
    {
        this.flavor = copy.flavor;// this.represent fields. copy. represent the new obj 
        this.size = copy.size;
        this.count = copy.count;
        
    }
    /*
    setCount Method is created so when it is called the count that 
    was sent will be the new inner field count
    */
    public void setCount(int count)//accepts 1 arugment
    {
        this.count = count;
        
    }
    /*
    equal method is created to make sure that two objs
    have the same inner fields not comparing addresses
    */
    public boolean equals(IceCream obj) // accepts 1 obj
    {
        // comparing the 3 inner fields with the other obj 3 inner fields
 
        if(this.flavor.equals(obj.flavor) && this.size.equals(obj.size) && this.count == obj.count) 
        {
           
            return true;
            
        }
        
        return false;
    }
    /*
    toString method will display the output posted below if the IceCream obj
    is called in the System.out in Main
    */
    public String toString()
    {
        String str = "Flavor: " + this.flavor + "\n" +
                     "Size: " + this.size + "\n" +
                     "Count: " + this.count + "\n";
        return str;
    }
    
}
