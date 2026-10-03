import java.util.Scanner;
public class CombinedWaterSystem {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args) {
        int houseNumber = 204;
        int familyMembers = 5;
        char usageStatus = 'A'; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter morning usage: ");
        int morning = input.nextInt();
        System.out.print("Enter evening usage: ");
        int evening = input.nextInt();
        int totalUsageInt = calculateTotal(morning, evening);
        double waterConsumed = totalUsageInt;
        input.close();
        int waterBill;
        if (waterConsumed <= 500) {
            waterBill = 100;
        } else {
            waterBill = 200;
        }
        System.out.println("House Number: " + houseNumber);
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Usage Status: " + usageStatus);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("Water Bill: Rs. " + waterBill);
    }
}
