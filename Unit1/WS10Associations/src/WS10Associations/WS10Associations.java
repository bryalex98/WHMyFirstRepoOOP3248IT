
package WS10Associations;

import ec.edu.espe.classimplementation.model.A;
import ec.edu.espe.classimplementation.model.B;
import ec.edu.espe.classimplementation.model.C;
import ec.edu.espe.classimplementation.model.E;
import java.util.ArrayList;

/**
 *
 * @author Bryan Pazmiño
 */
public class WS10Associations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        E[] es = new E[5];
        B b = new B(0,0, es);
        ArrayList<C> cs = new ArrayList<>();
        
        A a = new A(b, cs);
        System.out.println("Object of type A --> "+a);
        a.m();
        
    }
    
}
