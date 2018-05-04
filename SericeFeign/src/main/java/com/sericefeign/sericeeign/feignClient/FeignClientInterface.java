package com.sericefeign.sericeeign.feignClient;


import com.sericefeign.sericeeign.HiHystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi" ,fallback = SchedualServiceHiHystric.class)//指向那个服务
public interface  FeignClientInterface {
    //指向服务对应的请求方法，这里可以自定义方法名,不需要引入他的类
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
