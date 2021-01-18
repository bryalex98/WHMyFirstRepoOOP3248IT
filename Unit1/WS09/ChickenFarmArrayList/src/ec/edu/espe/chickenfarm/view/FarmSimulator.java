
package ec.edu.espe.chickenfarm.view;

import com.google.gson.Gson;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Bryan Pazmiño
 */
public class FarmSimulator {
    
    public static void main(String[] args) {
        
        Egg egg;
        egg = new Egg(1);

        
        
        
            
        
        
        Chicken chicken = new Chicken(0,"Lucy","white",1,true);
        Chicken chicken2 = new Chicken(1,"Mary","black",2,false);
        
        Chicken[] chickens;
        chickens = new Chicken[3];
        
        int[] numbers = {3,8,89,23};
        String[] toys = {"car","lego","doll","ball","robot","gun","pool"};
        
        System.out.println("numbers size -> "+ numbers.length);
        
        try{
        System.out.println("numbers[5] --> "+ numbers[4]);
        
            
        }catch(Exception ex){
            System.out.println("Exception -> "+ ex.getMessage());
            System.out.println(ex.toString());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        
        for(int i = 0; i < toys.length; i++){
            System.out.println("toy["+(i+1)+"]->"+toys[i]);
        }
        
        toys[1]="legos";
        for (String toy : toys){
            System.out.println("toy ->"+toy);        
        }
        
        int size;
        size = 10;
        
        int[] grades = new int[size];
        
        System.out.println("chickens --> "+ chickens[0]);
        System.out.println("chickens --> "+ chickens[1]);
        System.out.println("chickens --> "+ chickens[2]);
        
        for(int i = 0; i<chickens.length;i++){
            chickens[i]= new Chicken(i,"name"+i,"white",0,true);
        }
        
        int counter=0;
        for (Chicken ch: chickens){
            System.out.println("chicken (" + (++counter) + ") ->"+ ch);
        }
        
        ///library: GSON
        Gson gson=new Gson();
        String jsonChicken;
        
        //serialization
        jsonChicken=gson.toJson(chicken);
        
        System.out.println("chicken in json format -> "+jsonChicken);
        
        jsonChicken=gson.toJson(chicken2);
        
        System.out.println("chicken in json format -> "+jsonChicken);
        
        //deserialization
        
        String jsonCh = "{\"id\":5,\"name\":\"Pepita\",\"color\":\"black\","
                + "\"age\":3,\"isMolting\":false}";
        
        Chicken chicken3;
        chicken3=gson.fromJson(jsonCh, Chicken.class);
        
        System.out.println("chicken 3 -> "+chicken3);
        
        //deserialization
       /* System.out.println("chicken (0) -> "+chicken[0]);
        System.out.println("chicken (0) -> "+chicken[1]);
        
        try{
            System.out.println("chicken (0) -> "+chickens[10]);
        }catch(Exception ex){
            System.out.println("No se acepta mas de 5 pollitos");
            
        }*/
        
       //Collection things;
        List things;
        things = new ArrayList();
        
        things.add(23000);
        things.add("Hello Bryan");
        things.add(1851.23F);
        things.add(new Chicken(0,"Josefina","Black",0,true));
        things.add(egg);
       
       
        System.out.println("==============================");
        System.out.println("Size of my things ArrayList --> "+things.size());
        System.out.println("==============================");
        
        System.out.println("egg --> " +egg);
        System.out.println("Size of my things ArrayList --> "+things.size());
        
        System.out.println("The things are --> "+things);
        
        things.add(chicken);
        things.add(chicken2);
        System.out.println("Size of my ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
        things.remove(chicken);
        System.out.println("Size of my things ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
        things.remove(1851.23F);
        System.out.println("Size of my things ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
        if(things.remove(1851.23F)){
            System.out.println("OBJECT WAS REMOVED");
            System.out.println("Size of my things ArrayList --> " +things.size());
            System.out.println("The things are --> " +things);
            
        }else{
            System.out.println(" *** OBJECT WAS NOT REMOVED OR DID NOT EXIST IN THE ARRAYLIST ***");
        }
        
        
        try{
            things.remove(23000);
            
        }catch(Exception ex){
            System.out.println("--> Ese indice no existe <--");
        }
        
        Integer dataToRemove = new Integer(34000);
        things.remove(new Integer(23000));
        System.out.println("Size of my things ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
        things.add(34000);
        System.out.println("Size of my things ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
        things.remove(dataToRemove);
        System.out.println("Size of my things ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
        things.add(1,50);
        System.out.println("Size of my things ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
        things.add(1, 24500.456F);
        System.out.println("Size of my things ArrayList --> " +things.size());
        System.out.println("The things are --> " +things);
        
  
    }
    
}
