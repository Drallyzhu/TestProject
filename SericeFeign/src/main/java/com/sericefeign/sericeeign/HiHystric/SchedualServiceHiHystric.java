package com.sericefeign.sericeeign.HiHystric;

import com.sericefeign.sericeeign.feignClient.FeignClientInterface;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignClientInterface {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
