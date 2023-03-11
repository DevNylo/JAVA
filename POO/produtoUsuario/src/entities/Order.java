package entities;

import java.util.Date;

import enums.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;
    private OrderItem item;

    public Order(){}

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){

    }

    public void removeItem(OrderItem item){

    }

    public Double total(){
        return 0.0;
    }

}
