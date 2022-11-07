package s0start;

public class Power {
	
	
	/*
	 * Die Funktion potenziert die Fliesskommerzahl x mit dem integer Wert n
	 */
	
	public static double power(double x, int n) {
	 	if (n == 0) {
	 		return 1.0;
	 	}
	 	double z = x;
	 	while (n > 1) {
	 		z = z * x;         // man muss z mit x multiplieren, da sich z immer erhöht
	 		n--;			   // n muss immer um 1 runtergezählt werden und nicht jedes mal um die hälfte verkürzt werden
	 	}
	 	return z;
	 }
    
	public static void main(String[] args) {
		System.out.println(power(2,3));
	}
}