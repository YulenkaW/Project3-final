
package project3.pkg2;


public class ElectricVehicle {

    //private static Object keyboard;
 String Make;
 String Model;
 String Color;
 double KilometersPerKilowattHour;
 double MaxKilowattHoursInBattery;
 double CurrentKilowatHoursInBattery;



    
    public ElectricVehicle(String Make, String Model, String Color, double KilometersPerKw, double CurrentKilowatHoursInBattery,double MaxKilowattHoursInBattery){
    this.Model=Model;
    this.Make=Make;
    this.Color=Color;
    KilometersPerKilowattHour=KilometersPerKw;
    this.CurrentKilowatHoursInBattery=10;
     this.MaxKilowattHoursInBattery=MaxKilowattHoursInBattery ;
    }
    

@Override
    public String toString() {
        String wht1;
        wht1=String.format("%s %s %s ", Color, Make, Model);
        String wth2=String.format("%d\n  %d\n  %d\n  out of %d\n", KilometersPerKilowattHour,CurrentKilowatHoursInBattery, MaxKilowattHoursInBattery );
        
        return wht1+wth2;
        
        
    }
     public void charge(int charge ){
         CurrentKilowatHoursInBattery+=charge;
        if (CurrentKilowatHoursInBattery>MaxKilowattHoursInBattery){
           CurrentKilowatHoursInBattery= MaxKilowattHoursInBattery;
        }
        if (CurrentKilowatHoursInBattery<=0){
            System.out.println("Your battery is 0, charge it ");
        }
     }
     
      public boolean kilometersToDrive(double distance){
        
     double km=CurrentKilowatHoursInBattery-(distance/KilometersPerKilowattHour);
       
     
    if (CurrentKilowatHoursInBattery>=0){
     return true;
    }
  CurrentKilowatHoursInBattery=0;
  return false;    
      }
      



    public String getMake() {
        return Make;
}
    public void setMake(String Make) {
        this.Make=Make;
}
    public String getModel(){
        return Model;
    }
    public void setModel(String Model){
        this.Model=Model;
    }
        
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color=Color;
    }
     public double getKilometersPerKilowattHour(){
        return KilometersPerKilowattHour;
    }
     public void setKilometersPerKilowattHour(double KilometersPerKilowattHour){
         this.KilometersPerKilowattHour=KilometersPerKilowattHour;
     }
     public double getMaxKilowattHoursInBattery(){
         return MaxKilowattHoursInBattery;
}
     public void setMaxKilowattHoursInBattery(double MaxKilowattHoursInBattery){
         this.MaxKilowattHoursInBattery=MaxKilowattHoursInBattery;
     }  
     public double getCurrentKilowatHoursInBattery(){
         return CurrentKilowatHoursInBattery;
}
     public void setCurrentKilowatHoursInBattery(double CurrentKilowatHoursInBattery){
         this.CurrentKilowatHoursInBattery=CurrentKilowatHoursInBattery;
     }  

}
