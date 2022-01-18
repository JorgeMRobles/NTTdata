package com.everis.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.productservice.configuration.ProductServiceConfig;

@RestController("api")
public class ProductController {

	@Value("${server.port}")
	private String port;

	private ProductServiceConfig productServiceConfig;

	public ProductController(ProductServiceConfig productServiceConfig) {
		this.productServiceConfig = productServiceConfig;
	}

	@GetMapping("/product")
	public String getPort() {
		return "El puerto del micro es " + port;
	}

	@GetMapping("/product-name")
	public String getProductName() {
		return "EL nombre del producto es " + productServiceConfig.getName();
	}

}
