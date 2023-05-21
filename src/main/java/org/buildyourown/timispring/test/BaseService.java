package org.buildyourown.timispring.test;

public class BaseService {
    private BaseBaseService bbs;

    public BaseService() {
    }

    public BaseBaseService getBbs() {
        return bbs;
    }

    public void setBbs(BaseBaseService bbs) {
        this.bbs = bbs;
    }

    public void sayHello() {
        System.out.print("Base Service says hello");
        bbs.sayHello();
    }
}