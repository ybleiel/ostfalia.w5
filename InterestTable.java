public class InterestTable
{
    public static int howmanySpaces(double steuer) {
        String spaces;
        int i;

        spaces = "";
        i = 1;
        while (steuer > 0.00) {
            steuer /= 10.00;
            steuer %= 10.00;
            i++;
        }
        //System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        double [] kapital, freibetrag;
        double [][] steuer;
        double geld1, geld2;
        int i, a;

        kapital = new double[8];
        freibetrag = new double[8];
        steuer = new double[8][8];
        geld1 = 10000.00;
        geld2 = 700;
        i = 0;
        a = 0;
        while (i < 8) {
            kapital[i] = geld1;
            System.out.print(" " + kapital[i]);
            geld1 += 10000.00;
            i++;
        }
        System.out.print("\n");
        freibetrag[0] = 250;
        freibetrag[1] = 600;
        i = 2;
        while (i < 8) {
            freibetrag[i] = geld2;
            geld2 += 100;
            i++;
        }
        i = 0;
        while (i < 8) {
            System.out.print(i + 1);
            while (a < 8) {
                steuer[i][a] = kapital[a] * 0.025;
               if (steuer[i][a] > freibetrag[i])
                    steuer[i][a] = (steuer[i][a] - freibetrag[i]) * 0.25;
               else
                   steuer[i][a] = 0.00;
                System.out.print("   " + steuer[i][a]);
                a++;
            }
            System.out.print("\n");
            i++;
            a = 0;
        }
    }
}
