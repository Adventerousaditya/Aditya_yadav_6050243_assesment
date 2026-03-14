package cg.demo.assesment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class AppDAO {

    private final EntityManagerFactory emf;
    private final EntityManager em;

    public AppDAO() {
        this.emf = Persistence.createEntityManagerFactory("JPA-PU");
        this.em = emf.createEntityManager();
    }

    public AbesOrder insertOrder(AbesOrder order) {
        em.getTransaction().begin();
        em.persist(order);
        em.getTransaction().commit();
        return order;
    }

    public AbesOrder getOrderById(int id) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AbesOrder> cq = cb.createQuery(AbesOrder.class);

        Root<AbesOrder> order = cq.from(AbesOrder.class);

        cq.select(order)
          .where(cb.equal(order.get("orderId"), id));

        return em.createQuery(cq).getSingleResult();
    }

    public List<AbesOrder> findOrderByName(String name) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AbesOrder> cq = cb.createQuery(AbesOrder.class);

        Root<AbesOrder> order = cq.from(AbesOrder.class);

        cq.select(order)
          .where(cb.equal(order.get("customer").get("name"), name));

        return em.createQuery(cq).getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}