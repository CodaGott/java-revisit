package main;

import delivery.service.DeliveryService;
import model.Invoice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        List<Invoice> invoices = deliveryService.delivery();
    }
}
