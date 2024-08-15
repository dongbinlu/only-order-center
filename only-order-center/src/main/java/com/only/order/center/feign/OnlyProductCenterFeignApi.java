package com.only.order.center.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provided", url = "http://localhost:8092", path = "/product")
public interface OnlyProductCenterFeignApi {

    @GetMapping("/{id}")
    String product(@PathVariable("id") Integer id);

}
