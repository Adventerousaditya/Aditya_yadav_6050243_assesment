package cg.demo.assesment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "abes_order")
public class AbesOrder {

    @Id
    private int orderId;
    private String orderDate;
    private double orderAmt;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public AbesOrder() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(double orderAmt) {
        this.orderAmt = orderAmt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "AbesOrder [orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderAmt=" + orderAmt + "]";
    }
}