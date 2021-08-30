package com.serviceImp;

import com.service.PayService;

public class AliPayService implements PayService {
    public AliPayService() {
    }

    public void pay() {
        System.out.println("支付宝支付");
    }
}
