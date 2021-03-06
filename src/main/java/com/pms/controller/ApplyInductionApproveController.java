package com.pms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplyInductionApproveController {
	/**
	 * 日志工具
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/applyInductionApprove")
	public String index() {

		LOGGER.debug("访问主页:ApplyInductionApprove");
		return "ApplyInductionApprove";
	}

}
