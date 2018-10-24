package com.pms.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.pms.service.ApplyInductionService;

@Controller
public class ApplyInductionController {
	/**
	 * 日志工具
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private ApplyInductionService applyInductionService;

	@RequestMapping("/applyInduction")
	public String index() {

		LOGGER.debug("访问主页:ApplyInduction");
		return "ApplyInduction";
	}

	@ResponseBody
	@RequestMapping(value = "/queryApplyInduction", method = RequestMethod.POST)
	public Map<String, Object> queryApplyInduction(@RequestParam("page") Integer page,
			@RequestParam("rows") Integer rows) {
		System.out.println("rows:" + rows + "   page:" + page);
		Map<String, Object> result = applyInductionService.queryApplyInduction(page, rows);

		System.out.println(JSON.toJSONString(result));

		return result;

	}
}
