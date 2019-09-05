package org.lanqiao.sessionshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableCaching
@EnableRedisHttpSession
@SpringBootApplication
public class SessionShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionShareApplication.class, args);
	}

}
