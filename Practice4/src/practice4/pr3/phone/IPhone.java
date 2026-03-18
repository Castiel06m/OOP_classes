package practice4.pr3.phone;

import practice4.pr3.intefaces.SellableAndPluggable;

public class IPhone implements SellableAndPluggable {

    @Override
    public void plugIn() {
        System.out.println("IPhone plugged");
    }

    @Override
    public void sell() {
        System.out.println("IPhone sold");
    }
}
