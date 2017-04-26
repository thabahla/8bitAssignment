package test;
import entities.Cic;
import entities.Entity;
import java.util.Date;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
 

 
public class TestJPA {
 
    private EntityManager manager;
 
    public TestJPA(EntityManager manager) {
        this.manager = manager;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager manager = factory.createEntityManager();
        
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            Entity entity = new Entity();
            entity.setEmail("email2");
            entity.setName("name2");
            manager.persist(entity);
            Cic cic = new Cic();
            cic.setBody("BODY");
            cic.setEntityId(entity);
            cic.setSourceSystem("srcSys");
            cic.setSubject("subj");
            cic.setType("type");
            cic.setTimestamp(new Date());
            manager.persist(cic);
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
        
        System.out.println(".. done");
    }
    
 }