package cfranc.hanoi;

public class Disque implements Comparable<Disque>{
    int d;

    public Disque(int d) {
        this.d = d;
    }

	@Override
	public int compareTo(Disque obj) {
		int res = 0;
		// Diamètre disque courant inférieur au diamètre du disque cible
		if (this.d < obj.d) {
			res = -1;
		}
		// Diamètre disque courant égal au diamètre du disque cible
		else if (this.d == obj.d) {
			res = 0;
		}
		// Diamètre disque courant supérieur au diamètre du disque cible
		else {
			res = 1;
		}
		return res;
	}
}
