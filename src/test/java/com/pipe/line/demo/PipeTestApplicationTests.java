package com.pipe.line.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PipeTestApplicationTests {

	@Test
	void dummy() {
		assertThat(true).isTrue();
	}

}
