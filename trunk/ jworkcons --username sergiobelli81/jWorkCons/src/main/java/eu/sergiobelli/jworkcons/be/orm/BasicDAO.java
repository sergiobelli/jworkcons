package eu.sergiobelli.jworkcons.be.orm;

import java.io.Serializable;
import java.util.List;

public interface BasicDAO <Bean , PK extends Serializable> {

    public Bean create(Bean newInstance);
    
    public Bean read(PK id);

    public void update(Bean transientObject);

    public void delete(Bean persistentObject);
    
    public List<Bean> listAll(); 
    
    public List<Bean> listAll(String orderCol,boolean asc); 
    
    public List<Bean> listByExample(Bean exampleInstance);
    
    public List<Bean> listByExample(Bean exampleInstance,String orderCol,boolean asc);
   
}
