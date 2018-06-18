public class Line {

    public static String Tickets(int[] peopleInLine)
    {
        int numOf25Bills = 0;
        int numOf50Bills = 0;
        for (int buyer : peopleInLine){
            if (buyer == 25){
                numOf25Bills++;
            }
            if (buyer == 50){
                numOf25Bills--;
                if (numOf25Bills < 0){
                    return "NO";
                }
                numOf50Bills++;
            }
            if (buyer == 100){
                if (numOf25Bills > 2){
                    numOf25Bills -= 3;
                } else {
                    numOf25Bills--;
                    numOf50Bills--;
                    if (numOf25Bills < 0 || numOf50Bills < 0){
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}
