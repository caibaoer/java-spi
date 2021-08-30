package com.serviceImp;

import com.service.PayService;

public class WxPayService implements PayService {
    public WxPayService() {
    }

    public void pay() {
        System.out.println("微信支付");
    }
}
