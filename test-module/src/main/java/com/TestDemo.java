package com;

import com.service.PayService;

import java.util.ServiceLoader;

public class TestDemo {
    public static void main(String[] args) {
        ServiceLoader<PayService> services = ServiceLoader.load(PayService.class);
        for (PayService service : services) {
            service.pay();
        }
    }
}

