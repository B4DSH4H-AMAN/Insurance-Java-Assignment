import java.util.*;

public class InsuranceDriver{
    public static void main(String[] args) {
        List<Insurance>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String choice = "";

        while(true){
            Insurance ins = null;
            System.out.println("DO YOU WANT TO QUIT YES[Y] / NO[N]: ");
            choice = sc.nextLine();

            if(choice.equalsIgnoreCase("y")){
                break;
            }
            System.out.println("ENTER TYPE OF INSURANCE: ");
            String type = sc.nextLine();
            System.out.println("\nENTER MONTHLY COST: ");
            double cost = sc.nextDouble();
            sc.nextLine();

            if(type.equalsIgnoreCase("health")){
                ins=new Health();
                ins.setMonthlyCost(cost);
                ins.displayInfo();
            }
            else if(type.equalsIgnoreCase("life")){
                ins=new Life();
                ins.setMonthlyCost(cost);
                ins.displayInfo();
            }
        }
    }
}