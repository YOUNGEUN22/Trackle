package com.gas.trackle;

import com.gas.trackle.util.Crawling;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrackleApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() throws Exception {
		Crawling.getArticle();
	}
}
