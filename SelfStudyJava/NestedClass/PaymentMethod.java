package NestedClass;

public interface PaymentMethod {
    public void pay(double amount);
}

class PaymentService {
    public void makePayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}

class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        // Thanh toán qua thẻ tín dụng
        service.makePayment(new PaymentMethod() {
            @Override
            public void pay(double amount) {
                System.out.println("Paying " + amount + " via Credit Card.");
            }
        }, 150.00);

        // Thanh toán qua PayPal
        service.makePayment(new PaymentMethod() {
            @Override
            public void pay(double amount) {
                System.out.println("Paying " + amount + " via PayPal.");
            }
        }, 100.00);

        // Thanh toán bằng tiền mặt
        service.makePayment(new PaymentMethod() {
            @Override
            public void pay(double amount) {
                System.out.println("Paying " + amount + " in Cash.");
            }
        }, 200.00);
    }
}