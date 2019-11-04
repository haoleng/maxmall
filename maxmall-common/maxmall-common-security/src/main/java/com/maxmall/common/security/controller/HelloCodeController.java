package com.maxmall.common.security.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.maxmall.common.security.SecurityResult;
import com.maxmall.common.security.properties.SecurityConstants;

/**
 * 生成校验码的请求处理器
 *
 * @author maxmall.net@gmail.com
 */
@RestController
public class HelloCodeController {


	
	/**
	 * Check code object.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param type     the type
	 *
	 * @return the object
	 */
	@GetMapping("api/hello")
	public SecurityResult checkCode(HttpServletRequest request, HttpServletResponse response) {
		SecurityResult result = new SecurityResult(SecurityResult.SUCCESS_CODE, "hello", true);
		return result;
	}
}
