public abstract class Insurance {
    private String typeInsurance;
    private double monthlyCost;

    public Insurance(String typeInsurance){
        this.typeInsurance = typeInsurance;
    }

    public void setMonthlyCost(double monthlyCost){
        this.monthlyCost = monthlyCost;
    }

    public String getTypeInsurance(){
        return typeInsurance;
    }

    public double getMonthlyCost(){
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}
