
package ejercicios4;

import java.util.ArrayList;
import java.util.Collections;



public class Exercises
{
    static int getSum(ArrayList<Integer> list)
    {  

    int suma=0;
    for(int i=0;i<list.size();i++){
       suma =list.get(i)+ suma;
    }
        return suma;
    }
    
    static boolean exists(ArrayList<String> list, String value)
    {
        boolean buscar=false;
        if(list.contains(value)){
            buscar=true;
            
        }
        return buscar;
    }
    
    static ArrayList<Integer> sort(ArrayList<Integer> list)
    {
        ArrayList<Integer> answer = new ArrayList<>();
        Collections.sort(list);
        return list;

    
    }
}
