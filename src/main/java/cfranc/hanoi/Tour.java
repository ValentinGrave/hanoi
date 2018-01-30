package cfranc.hanoi;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;

public class Tour implements IPile<Disque>{

	int hauteurMax = 3;
	
        /* Transformation d'une liste FIFO (First In First Out) en une liste LIFO (Last In First Out),
           sinon on retirerait les cercles à la base des tours et non pas ceux à leurs sommets */
        // Création d'une liste FIFO
	Deque<Disque> disquesFIFO = new ArrayDeque<Disque>();
        // Conversion de la liste FIFO en liste LIFO
        Queue<Disque> disques = Collections.asLifoQueue(disquesFIFO);
        
	@Override
	public boolean empiler(Disque d) {
        boolean res = false;
        if(disques.isEmpty()){
            disques.offer(d);
            res = true;
        }
        else{
            if( (disques.element().d > d.d) && (taille() < hauteurMax) ){
                res = true;
                disques.offer(d);
            }
            else{
                res = false;
            }
        }
        return res;
	}

	public Tour() {
		super();
	}

	public Tour(int hauteurMax) {
		super();
		this.hauteurMax = hauteurMax;
	}

	@Override
	public Disque depiler() {
		return disques.poll();
	}

	@Override
	public Disque sommet() {		
		return disques.peek();
	}

	@Override
	public boolean estVide() {
		return disques.isEmpty();
	}

	@Override
	public boolean estPleine() {
		if(taille() == hauteurMax){
			return true;
		}
		return false;
	}

	@Override
	public int taille() {
		return disques.size();
	}

	@Override
	public int diam() {		
		int res = Integer.MAX_VALUE;
		Disque disqueSommet = sommet();
		if(disqueSommet != null){
			res = disqueSommet.d;
		}
		return res;
	}

}
