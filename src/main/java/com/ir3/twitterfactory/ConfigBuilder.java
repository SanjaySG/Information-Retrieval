package com.ir3.twitterfactory;

import twitter4j.conf.ConfigurationBuilder;

public class ConfigBuilder {

	private static final String OAuth_Consumer_Key = "<Consumer Key>";
	private static final String OAuth_Consumer_Secret = "<Consumer Secret>";
	private static final String OAuth_Access_Token = "<Access Token>";
	private static final String OAuth_Access_Secret = "<Access Secret>";
	private static ConfigurationBuilder conf;

	protected static final ConfigurationBuilder getConfig() {
		if(null == conf)
			conf = new ConfigurationBuilder();
		
		setConfBuilderParams();
		return conf;
	}
	
	private static void setConfBuilderParams() {
		conf.setDebugEnabled(true).setOAuthConsumerKey(OAuth_Consumer_Key)
				.setOAuthConsumerSecret(OAuth_Consumer_Secret)
				.setOAuthAccessToken(OAuth_Access_Token)
				.setOAuthAccessTokenSecret(OAuth_Access_Secret);
	}
}
