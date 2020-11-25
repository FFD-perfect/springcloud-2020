package cn.siwen.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class OrderController {
   private static  final String INVOME_URL = "http://consul-provider-order";
   @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/consul")
    public String  payment() {
                String result= restTemplate.getForObject(INVOME_URL + "/payment/consul", String.class);
        	    return result;
        	    }
	}


