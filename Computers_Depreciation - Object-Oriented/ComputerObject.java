
//This is the Super class which Laptops and Desktops will inherit the attributes from.

public abstract class ComputerObject {
    //This is where I declare all of the superclass(Computer) variables that will be used by both Laptops and Desktops computers.
    //These are attributes of all Computers(Desktop/Laptop).
    private int usefulLife = 1; 
    private String stockCode = "XXXXXXXX";
    private int purchasingCost = 10000;
    private String staffNumber = "XXXXXXXX";
    private String serialNumber = "ABCDEFG";
    private String cpuType = "Multicore Parallel Threading";
    private int ramAmount = 12;
      
    /**Default construct.*/
     protected ComputerObject() { }
     
    //Construct a full Computer object.   
    protected ComputerObject(int usefulLife, String stockCode,int purchasingCost,
    String staffNumber,String serialNumber ,String cpuType, int ramAmount) { 
        setUsfulLife(usefulLife);
        setPurchasingCost(purchasingCost);
        setRamAmount(ramAmount);
        setStockCode(stockCode);
        setStaffNumber(staffNumber);
        setCpuType(cpuType);
        setSerialNumber(serialNumber);
    }
     
    /**Getter/Accessor methods*/ 
    public int getUsfulLife(){
        return usefulLife; 
     }
     
     public int getPurchasingCost(){
        return purchasingCost; 
     }
     
     public int getRamAmount(){
        return ramAmount; 
     }
     
    public String getStockCode(){
        return stockCode; 
     }
     
    public String getStaffNumber(){
        return staffNumber; 
     }
     
    public String getCpuType(){
        return cpuType; 
     }
     
    public String getSerialNumber(){
        return serialNumber; 
     }
     
     
    /**Setter/Mutator methods*/
    public void setUsfulLife(int usefulLife){
        this.usefulLife = usefulLife;
     }
    
    public void setPurchasingCost(int purchasingCost){
        this.purchasingCost = purchasingCost;
     }
    
    public void setRamAmount(int ramAmount){
        this.ramAmount = ramAmount;
     } 
     
    public void setStockCode(String stockCode){
        this.stockCode = stockCode; 
     } 
     
    public void setStaffNumber(String staffNumber){
        this.staffNumber = staffNumber ;
     } 
     
    public void setCpuType(String cpuType){
        this.cpuType = cpuType ;
     } 
     
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber ;
     } 
     
    /**Abstract method AnnualDepreciation*/ 
    //The implementations of this method can be found in the Laptop and Desktop sub-classes.
    public abstract double AnnualDepreciation(); 
}

