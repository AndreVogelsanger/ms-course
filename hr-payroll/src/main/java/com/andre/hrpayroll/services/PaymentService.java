package com.andre.hrpayroll.services;

import com.andre.hrpayroll.entities.Payment;
import com.andre.hrpayroll.entities.Worker;
import com.andre.hrpayroll.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

//    @Value("${hr-worker.host}")
//    private String workerHost;

    @Autowired
    private WorkerFeignClient workerFeignClient;
//    private RestTemplate restTemplate;

    public Payment getPayment(long workerId, int days){

//        Map<String,String> uriVariables = new HashMap<>();
//        uriVariables.put("id",""+workerId);

//        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}",Worker.class,uriVariables);

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
