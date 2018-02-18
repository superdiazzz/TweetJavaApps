package handler;

import configuration.TweetConfig;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TweetInstance {
	
	public static Twitter instance(){
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey(TweetConfig.CONSUMER_KEY);
		cb.setOAuthConsumerSecret(TweetConfig.CONSUMER_KEY_SECRET);
		cb.setOAuthAccessToken(TweetConfig.ACCESS_TOKEN);
		cb.setOAuthAccessTokenSecret(TweetConfig.ACCESS_TOKEN_SECRET);
		
		TwitterFactory factory = new TwitterFactory(cb.build());
		Twitter twitterIns = factory.getInstance();
		
		return twitterIns;
	}

}
