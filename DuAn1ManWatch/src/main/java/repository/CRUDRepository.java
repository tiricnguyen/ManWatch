/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utillies.HibernateUtil;

/**
 *
 * @author Admin
 */
public abstract class CRUDRepository<K, Entity, Response> {

    protected Session session;
    protected Transaction transaction;
    protected String className;
    protected String res;

    public List<Response> getAllResponse() {
        List<Response> list = new ArrayList<>();
        try {
            session = HibernateUtil.getSession();
            String hql = "select " + res + " from " + className + " a";
            Query query = session.createQuery(hql);
            list = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return list;

    }

    public Entity saveOrUpdate(Entity entity) {
        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(res);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return entity;
    }

    public boolean delete(Entity entity) {
        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean saveAll(List<Entity> list) {
        try {
            session = HibernateUtil.getSession();
            transaction = session.beginTransaction();
            for (Entity x : list) {
                session.saveOrUpdate(x);
            }
            transaction.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public Entity findById(K id) {
        Entity entity = null;
        try {
            session = HibernateUtil.getSession();
            String hql = "select a from " + className + "a where id =: id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            entity = (Entity) query.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);

        }
        return entity;
    }

    public Entity findByMa(String ma) {
        Entity entity = null;
        try {
            session = HibernateUtil.getSession();
            String hql = "select a from " + className + "a where ma =: ma";
            Query query = session.createQuery(hql);
            query.setParameter("ma", ma);
            entity = (Entity) query.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);

        }
        return entity;
    }

}
