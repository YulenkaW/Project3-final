
package project3.pkg2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ElectricVehicleTest {
    
    public ElectricVehicleTest() {
    }
    @Test
            public void testConstructor(){
                //arrage 
                
                String expectedColor= "color";
                String expectedMake="";
                String expectedModel="model";
                double expectedMaxKilowattHoursInBattery=1000;
                double expectedKilometersPerKilowattHour=1;    
                double expectedCurrentKilowatHoursInBattery=350;
                //act
   
    ElectricVehicle electricVehicle = new ElectricVehicle(expectedMake, expectedModel, expectedColor, expectedKilometersPerKilowattHour, expectedCurrentKilowatHoursInBattery,expectedMaxKilowattHoursInBattery);
    
    String actualColor=electricVehicle.getColor();
     
     double actualKilometersPerKilowattHour=electricVehicle.getKilometersPerKilowattHour();
     double actualCurrentKilowatHoursInBattery=electricVehicle.getCurrentKilowatHoursInBattery();
     double actualMaxKilowattHoursInBattery=electricVehicle.getMaxKilowattHoursInBattery();
     
     //assert
     assertEquals(expectedColor, actualColor);
     assertEquals(expectedKilometersPerKilowattHour,actualKilometersPerKilowattHour );
     assertEquals(expectedMaxKilowattHoursInBattery, actualMaxKilowattHoursInBattery);
     assertEquals(expectedCurrentKilowatHoursInBattery, actualCurrentKilowatHoursInBattery);
            }
            @Test
     public void testChargeNotLessThen0(){
         //arrage
        
                 String expectedColor= "color";
                String expectedMake="";
                String expectedModel="model";
                double expectedMaxKilowattHoursInBattery=1000;
                double expectedKilometersPerKilowattHour=0;    
                double expectedCurrentKilowatHoursInBattery=350;
                ElectricVehicle electricVehicle =new ElectricVehicle(expectedMake,expectedModel,expectedColor, expectedCurrentKilowatHoursInBattery, expectedKilometersPerKilowattHour,expectedMaxKilowattHoursInBattery);
                
         //act
         electricVehicle.setCurrentKilowatHoursInBattery(-10);
         double actualCurrentKilowatHoursInBattery=electricVehicle.getCurrentKilowatHoursInBattery();
         
         //assert
         assertEquals(expectedCurrentKilowatHoursInBattery, actualCurrentKilowatHoursInBattery);
     }
     
     @Test
     
    public void testKilometersToDrivNotLessThen0(){
         //arrage
        
                 String expectedColor= "color";
                String expectedMake="";
                String expectedModel="model";
                double expectedMaxKilowattHoursInBattery=1000;
                double expectedKilometersPerKilowattHour=0;    
                double expectedCurrentKilowatHoursInBattery=350;
                ElectricVehicle electricVehicle =new ElectricVehicle(expectedMake,expectedModel,expectedColor, expectedCurrentKilowatHoursInBattery, expectedKilometersPerKilowattHour,expectedMaxKilowattHoursInBattery);
         //act
         boolean actual =electricVehicle.kilometersToDrive(-5);
         double actualCurrentKilowatHoursInBattery=electricVehicle.getCurrentKilowatHoursInBattery();
         
         //assert
         assertEquals(expectedCurrentKilowatHoursInBattery, actualCurrentKilowatHoursInBattery);
         assertTrue(actual);
     }
           
                
     @Test
    
   
    public void testToString() {
       //System.out.println("toString");
        ElectricVehicle instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        

    }
    
    
    
    @Test
    public void testCharge() {
       // System.out.println("charge");
        int charge = 0;
        ElectricVehicle instance = null;
        instance.charge(charge);
        
    }
  
   
    
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String Color = "";
        ElectricVehicle instance = null;
        instance.setColor(Color);
        
        fail("The test case is a prototype.");
    }

   

  
}
