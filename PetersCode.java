package s0start;

public class PetersCode {
	public static void main(String[] args) {
		 int j = 0, l = 0; double x = 0;
		 for (; x < 100; ++x,++l){        // mit dem semicolon geht das programm nicht in die schleife rein sondern setzt l und x direkt auf 100
		 	 j++;                      // j = j++ erhöht j nicht, entweder man schreibt j++ oder j = j + 1
		 }
		 for (x = Math.pow(x, 8); j > 0; --x,++l) {
		 	 if (x <= x + 1) --j;          // die if bedingung konnte nie erfüllt werden
		 }
		 System.out.println(j+" "+l);
	}
}
