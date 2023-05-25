
//This is the Desktop sub-class that will inherit attributes from the ComputerObject class

public class Desktop extends ComputerObject {
        
        //Private variables that are only applicable to Desktop Computers.
        private String officeNumber = "Room XX";
        private int residualValue = 2000;
        
        /**Defualt constructor*/
        public Desktop(){
            //This is just a random set of values I assigned the constructor. 
            this(0,"XXXXXXXX",5000,"XXXXXXXX","ABCDEFG","Dual core I7",12,"Building XX Room X",4500);
        }

        //Call the constructor from the superclass and set all of the appropriate values. 
        public Desktop(int usefulLife, String stockCode,int purchasingCost,String staffNumber,
        String serialNumber ,String cpuType, int ramAmount,String officeNumber, int residualValue){
            super(usefulLife,stockCode,purchasingCost,staffNumber,serialNumber,cpuType,ramAmount);
            setOfficeNumber(officeNumber);
            setResidualValue(residualValue);
            // It is better to use the mutators than assigning the values here directly.
        }

         /**Getter/Accessor method for officeNumber*/ 
        public String getOfficeNumber(){
            return officeNumber; 
         }

        /**Setter/Mutator method for officeNumber*/ 
        public void setOfficeNumber(String officeNumber){
            this.officeNumber = officeNumber; 
         } 
         
         
         /**Getter/Accessor method for residualValue*/ 
        public int getResidualValue(){
            return residualValue; 
         }

        /**Setter/Mutator method for residualValue*/ 
        public void setResidualValue(int residualValue){
            this.residualValue = residualValue; 
         } 
        //This is the implementation of the abstract method. 
         public double AnnualDepreciation(){
            return (getPurchasingCost() - this.residualValue) /  getUsfulLife();
         }
         
         //The toString method for this sub-class.
         public String toString(){
            return ("Desktop with " + this.residualValue + " residual value and can be found at " + this.officeNumber);
         }
}