
package pl.infoshare.lesson9.homework;

import java.util.ArrayList;


public interface HomeworkList<T, K> {

    public <T, K> void HomeworkLista(T a, K b);
    
    
    public <T, K>void Put(T a, K b);
    
    public T getKey();    
    public K getValue();
    
    ArrayList key = new ArrayList();
    ArrayList value = new ArrayList();
   


}