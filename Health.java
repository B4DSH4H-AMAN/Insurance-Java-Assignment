public class Health extends Insurance{
    public Health(){
        super("Health");
    }
    @Override
    public void setInsuranceCost(double cost){
        super.setMonthlyCost(cost);
    }
    @Override
    public void displayInfo(){
        System.out.println("\nINSURANCE:\nType: "+this.getTypeInsurance()+"\nMonthly Cost: "+this.getMonthlyCost());
    }
}