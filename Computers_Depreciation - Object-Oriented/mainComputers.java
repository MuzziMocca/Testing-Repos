
//This is the main class to run this simple Personal Computer program.

public class mainComputers  
{
    public static void main(String[]args)
    {
        
        //Creation of Laptop objects that will be place into the ComputerObject array. 
        Laptop l1 = new Laptop(0,"123456789",5000,"98718224","ABCDEFG","Dual core I7",4,12,4000);
        Laptop l2 = new Laptop(1,"98763733",5400,"93348224","George","Dual core I9",4,10,3000);
        Laptop l3 = new Laptop(2,"12348784",500,"985566224","Jeffrey","Quad core I 11",8,14,5000);
        Laptop l4 = new Laptop(1,"98763735",5400,"12347563","Richard","Dual core I9",8,15,5000);
        Laptop l5 = new Laptop(3,"12348444",12000,"984266224","Frederick","Single core i5",4,12,2000);
        
        //Creation of Desktop objects that will be place into the ComputerObject array. 
        Desktop d1 = new Desktop(1,"1234564",5000,"98718264","ABCDEFG","Dual core I7",4,"Building G",4000);
        Desktop d2 = new Desktop(1,"12342322",5400,"93348424","George","Dual core I9",8,"Building R2 Room 6",3000);
        Desktop d3 = new Desktop(3,"76732374",10000,"98556324","Jeffrey","Quad core I 11",16,"Building G room5",5000);
        Desktop d4 = new Desktop(4,"12353542",7000,"12347543","Richard","Dual core I9",20,"Building 4 room 2",5000);
        Desktop d5 = new Desktop(2,"98767874",12000,"98426124","Frederick","Single core i5",14,"Last computer in S4",2000);
        
        //Declare ComputerObject array and fill it with Laptop and Desktop objects. 
        ComputerObject computers[] = new ComputerObject[10];
        computers[0] = d1;
        computers[1] = d3;
        computers[2] = d2;
        computers[3] = l1;
        computers[4] = l2;
        computers[5] = d4;
        computers[6] = l3;
        computers[7] = l4;
        computers[8] = d5;
        computers[9] = l5;
        
        for(int i =0 ; i< computers.length;i++)
        {
            /**The toString is overloaded by default and will be automatically called. 
            Polymorphism ensures that the correct method(AnnualDepreciation) is used without being specific as to  
            how the value should be calculated.*/ 
            System.out.println("Computer: " + i + " is a " + computers[i] + " . It has a Annual Depreciation value of " 
            + computers[i].AnnualDepreciation());
        }
        
        
    }
}
    
