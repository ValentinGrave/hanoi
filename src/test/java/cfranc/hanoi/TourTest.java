package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;


public class TourTest {

	@Test
	public void testEmpiler() {
            Tour tour = new Tour(4);
            Disque disqueA = new Disque(1);
            Disque disqueB = new Disque(2);
            Disque disqueC = new Disque(3);
            Disque disqueD = new Disque(3);
            
            if(tour.estVide() == true){
                assertEquals(true,tour.empiler(disqueA));
                assertEquals(true,tour.empiler(disqueB));
                assertEquals(true,tour.empiler(disqueC));
                assertEquals(true,tour.empiler(disqueD));
            }
            else{
                if(( tour.sommet() == disqueA ) && ( tour.taille() < tour.hauteurMax )){
                    assertEquals(false,tour.empiler(disqueA));
                    assertEquals(false,tour.empiler(disqueB));
                    assertEquals(false,tour.empiler(disqueC));
                    assertEquals(false,tour.empiler(disqueD));
                }
                else if(( tour.sommet() == disqueB ) && ( tour.taille() < tour.hauteurMax )){
                    assertEquals(true,tour.empiler(disqueA));
                    assertEquals(false,tour.empiler(disqueB));
                    assertEquals(false,tour.empiler(disqueC));
                    assertEquals(false,tour.empiler(disqueD));
                }
                else if(( tour.sommet() == disqueC ) && ( tour.taille() < tour.hauteurMax )){
                    assertEquals(true,tour.empiler(disqueA));
                    assertEquals(true,tour.empiler(disqueB));
                    assertEquals(false,tour.empiler(disqueC));
                    assertEquals(false,tour.empiler(disqueD));
                }
                else if(( tour.sommet() == disqueD ) && ( tour.taille() < tour.hauteurMax )){
                    assertEquals(true,tour.empiler(disqueA));
                    assertEquals(true,tour.empiler(disqueB));
                    assertEquals(false,tour.empiler(disqueC));
                    assertEquals(false,tour.empiler(disqueD));
                }
                else{
                    assertEquals(false,tour.empiler(disqueA));
                    assertEquals(false,tour.empiler(disqueB));
                    assertEquals(false,tour.empiler(disqueC));
                    assertEquals(false,tour.empiler(disqueD));
                }
            }
	}
}
