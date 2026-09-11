package com.thealiyev.designpatterns.structural.facade;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String product, double amount) {
        inventoryService.checkStock(product);
        paymentService.makePayment(amount);
        shippingService.arrangeShipping(product);
    }
}
