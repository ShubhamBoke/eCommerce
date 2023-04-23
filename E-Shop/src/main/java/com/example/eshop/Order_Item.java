package com.example.eshop;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Order_Item {
    private SimpleIntegerProperty o_id;
    private SimpleStringProperty p_name;
    private SimpleIntegerProperty quantity;
    private SimpleStringProperty date;
    private SimpleStringProperty status;
    private SimpleIntegerProperty bill;

    public Order_Item(int id, String name, int quantity, String date, String status, int bill) {
        this.o_id = new SimpleIntegerProperty(id);
        this.p_name = new SimpleStringProperty(name);
        this.quantity = new SimpleIntegerProperty(quantity);
        this.date = new SimpleStringProperty(date);
        this.status = new SimpleStringProperty(status);
        this.bill = new SimpleIntegerProperty(bill);
    }

    public int getO_id() {
        return o_id.get();
    }
    public String getP_name() {
        return p_name.get();
    }
    public int getQuantity() {
        return quantity.get();
    }

    public String getDate() {
        return date.get();
    }

    public String getStatus() {
        return status.get();
    }

    public int getBill() {
        return bill.get();
    }
}
