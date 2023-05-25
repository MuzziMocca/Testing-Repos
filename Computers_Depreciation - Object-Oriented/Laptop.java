
//This is the Laptop sub-class that will inherit attributes from the ComputerObject class.

public class Laptop extends ComputerObject { 
    
    //Private variables that are only applicable to Laptop Computers.
    private int screenSize = 14;
    private int insurancePolicy = 2000;
    
    /**Defualt constructor*/
    public Laptop(){
        //This is just a random set of values we assigned the constructor.
        this(0,"XXXXXXXX",5000,"XXXXXXXX","ABCDEFG","Dual core I7",4,12,3000);
    }

    //Call the constructor from the superclass and set all of the appropriate values.
    public Laptop(int usefulLife, String stockCode,int purchasingCost,String staffNumber,
    String serialNumber ,String cpuType, int ramAmount,int screenSize, int insurancePolicy){ 
        super(usefulLife,stockCode,purchasingCost,staffNumber,serialNumber,cpuType,ramAmount);
        setScreenSize(screenSize);
        setInsurancePolicy(insurancePolicy);
        // It is better to use the mutators than assigning the values here directly.
    }

     /**Getter/Accessor method for screenSize*/ 
    public int getScreenSize(){
        return screenSize; 
     }

    /**Setter/Mutator method for screenSize*/ 
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize; 
    }

     /**Getter/Accessor method for insurancePolicy*/ 
    public int getInsurancePolicy(){
        return insurancePolicy; 
     }

    /**Setter/Mutator method for insurancePolicy*/ 
    public void setInsurancePolicy(int insurancePolicy){
        this.insurancePolicy = insurancePolicy; 
    }

    //This is the implementation of the abstract class. 
    public double AnnualDepreciation(){
         if(screenSize >= 12)
         {
             return getPurchasingCost() * 0.20;
         }else
         {
             return getPurchasingCost() * 0.25;
         }
     }
     
     //The toString method for this sub-class.
     public String toString(){
        return ("Laptop with " + getScreenSize() + " Screen Size and an Insurance Policy of R" + getInsurancePolicy());
     }
 
 }