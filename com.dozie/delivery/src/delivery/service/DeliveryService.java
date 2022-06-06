package delivery.service;

import model.Invoice;
import services.BillingService;

import java.util.List;

public class DeliveryService {

    public List<Invoice> delivery(){
        BillingService billingService = BillingService.build();
        List<Invoice> invoices = billingService.generate();
        invoices.forEach(System.out::println);
        return invoices;
    }
}
