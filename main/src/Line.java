import java.util.HashMap;
import java.util.Map;

public class Line {

    public static String Tickets(int[] peopleInLine)
    {
        Register register = new Register();
        for (int buyer : peopleInLine){
            if (buyer == 50){
                if (register.haveBill(25)){
                    register.takeBill(25);
                } else {
                    return "NO";
                }
            }
            if (buyer == 100){
                if (register.haveBill(50) && register.haveBill(25)){
                    register.takeBill(25);
                    register.takeBill(50);
                } else {
                    return "NO";
                }
            }
            register.addBill(buyer);
        }
        return "YES";
    }

    public static class Register {
        private Map<Integer, Integer> amountByValue;

        public Register(){ amountByValue = new HashMap<>(); }

        public void addBill(int value){
            Integer numOfBills = amountByValue.getOrDefault(value, 0);
            amountByValue.put(value, ++numOfBills);
        }

        public boolean haveBill(int value){
            Integer numOfBills = amountByValue.get(value);
            return numOfBills != null && numOfBills != 0;
        }

        public void takeBill(int value){
            Integer numOfBills = amountByValue.get(value);
            amountByValue.put(value, --numOfBills);
        }


    }
}
