package com.huxin.tools;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huxin.tools.dao.CategoryDao;
import com.huxin.tools.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToolsApplicationTests {

	@Autowired
	CategoryDao categoryDao;

	static Logger logger = LoggerFactory.getLogger(ToolsApplicationTests.class);

	@Test
	public void contextLoads() {
		List<CategoryVo> categoryVos = categoryDao.selectCategoryVo();
		printJson(categoryVos);
	}

	public static void printJson(Object o)  {
		ObjectMapper mapper = new ObjectMapper();
		String s = null;
		try {
			s = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		logger.info(s);
	}


}
