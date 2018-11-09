package com.tedu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-user")
public interface HelloFeign {

	@RequestMapping("/index/{name}")
	public String index(@PathVariable("name") String name);
}
