package cor;

class ManagerPPower extends PurchasePower {
    private final double ALLOWABLE = 10 * BASE;
 
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
 
class DirectorPPower extends PurchasePower {
    private final double ALLOWABLE = 20 * BASE;
 
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Director will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
 
class VicePresidentPPower extends PurchasePower {
    private final double ALLOWABLE = 40 * BASE;
 
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Vice President will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
 
class PresidentPPower extends PurchasePower {
    private final double ALLOWABLE = 60 * BASE;
 
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("President will approve $" + request.getAmount());
        } else {
            System.out.println( "Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}
