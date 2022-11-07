package s0start;

public class InterestTable {
	
	public static int howmanySpaces(int steuer) {
        String spaces;
        int i;
        spaces = "";
        i = 0;
        if (steuer == 0)
        {
        	i = 1;
        }
        else {
        while (steuer > 0) {
            steuer /= 10;
            steuer %= 10;
            i++;
        }
        }
        System.out.print(" " + i + " ");
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
            System.out.printf(" %7.2f", kapital[i]);
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
               if (steuer[i][a] >= 100.00)
            	   System.out.printf("  %1.2f ", steuer[i][a]);
               else if (steuer[i][a] <= 100.00 && steuer[i][a] >= 10.00)
            	   System.out.printf("   %1.2f ", steuer[i][a]);
               else
            	   System.out.printf("    %1.2f ", steuer[i][a]);
                a++;
            }
            System.out.print("\n");
            i++;
            a = 0;
        }
    }
	
}
