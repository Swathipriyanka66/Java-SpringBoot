package com.cts.boot3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {
	
	@Value("${cloud.aws.credentials.access-key}")
		private String accessKey;

}
