import java.util.HashMap;
import java.util.Map;

public class Line {

    public static String Tickets(int[] peopleInLine)
    {
        Register register = new Register();
        for (int buyer : peopleInLine){
            if (buyer == 50){
                if (register.haveBills(25,1)){
                    register.takeBills(25,1);
                } else {
                    return "NO";
                }
            }
            if (buyer == 100){
                if (register.haveBills(50,1) && register.haveBills(25,1)){
                    register.takeBills(25,1);
                    register.takeBills(50,1);
                } else if (register.haveBills(25, 3)){
                    register.takeBills(25, 3);
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

        public boolean haveBills(int value, int amount){
            Integer numOfBills = amountByValue.get(value);
            return numOfBills != null && numOfBills >= amount;
        }

        public void takeBills(int value, int amount){
            Integer numOfBills = amountByValue.get(value);
            amountByValue.put(value, numOfBills - amount);
        }


    }
}
