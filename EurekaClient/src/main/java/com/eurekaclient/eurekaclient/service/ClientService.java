package com.eurekaclient.eurekaclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

    //通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口，
    // 在这里我们直接用的程序名替代了具体的url地址，在ribbon中它会根据服务名来选择具体的服务实例，
    // 根据服务实例在请求的时候会用具体的url替换掉服务名
    public String hiService(String name,String port) {
        return name+"=成功调用提供者服务！端口="+port;
    }
}
