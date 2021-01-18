
package ec.edu.espe.classimplementation.model;

import java.util.ArrayList;

/**
 *
 * @author Bryan Pazmiño
 */
public class A {
    
    private B b;
    private ArrayList<C> cs = new ArrayList<>();
    
    public C m(D d){
        return new C();
    }
    
    public D m(){
        return new D();
    }

    @Override
    public String toString() {
        return "A{" + "b=" + b + ", cs=" + cs + '}';
    }
    
    public A(B b, ArrayList<C> cs) {
        this.b = b;
        this.cs = cs;
    }
    
    
    /**
     * @return the b
     */
    public B getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(B b) {
        this.b = b;
    }

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }
        
}
