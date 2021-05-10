abstract class Plan {
    protected int rate;

    public abstract void addRate();

    public void calculateBill(int units) {
        System.out.println("Total is : " + (rate * units));
    }

}

class DomasticPlan extends Plan {
    public void addRate() {
        rate = 3;
    }
}

class CommercialPlan extends Plan {
    public void addRate() {
        rate = 7;
    }
}

class InstitutinalPlan extends Plan {
    public void addRate() {
        rate = 5;
    }
}

class GetPlanFactory {
    public Plan getPlanFactory(String planType) {
        if (planType == null) {
            return null;
        }
        switch (planType) {
            case "DOMASTIC":
                return new DomasticPlan();
            case "COMMERCIAL":
                return new CommercialPlan();
            case "INSTITUTION":
                return new InstitutinalPlan();
        }

        return null;
    }
}

public class Factory {
    public static void main(String args[]) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        Plan p = getPlanFactory.getPlanFactory("DOMASTIC");
        p.addRate();
        p.calculateBill(16);
    }
}
