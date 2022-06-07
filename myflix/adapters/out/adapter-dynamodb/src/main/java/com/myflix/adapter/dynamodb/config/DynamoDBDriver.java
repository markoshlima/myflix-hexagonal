package com.myflix.adapter.dynamodb.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDynamoDBRepositories(basePackages = "com.myflix.adapter.dynamodb")
public class DynamoDBDriver {

	//@Value("${amazon.aws.region}")
	private String region = "";

	//@Value("${amazon.aws.dynamodb.endpoint}")
	private String endpoint = "";

	//@Value("${amazon.aws.accesskey}")
	private String accessKey = "";

	//@Value("${amazon.aws.secretkey}")
	private String secretKey = "";

	public AWSCredentials amazonAWSCredendials(){
		return new BasicAWSCredentials(accessKey, secretKey);
	}

	public AWSCredentialsProvider amazonAWSCredendialsProvider(){
		return new AWSStaticCredentialsProvider(amazonAWSCredendials());
	}

	@Bean
	@Primary
	public AmazonDynamoDB amazonDynamoDB() {
		return AmazonDynamoDBClientBuilder.standard()
				.withCredentials(amazonAWSCredendialsProvider())
				.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpoint, region))
				.build();
	}


}