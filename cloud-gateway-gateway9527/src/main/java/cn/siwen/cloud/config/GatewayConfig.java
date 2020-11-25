package cn.siwen.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("toBaiduGuoNei",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
    }
}
