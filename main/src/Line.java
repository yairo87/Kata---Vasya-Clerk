public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        for (int buyer : peopleInLine){
            if (buyer > 25){
                return "NO";
            }
        }
        return "YES";
    }
}
