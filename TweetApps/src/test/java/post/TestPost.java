package post;

import org.junit.Test;

import handler.TweetInstance;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TestPost {

	@Test
	public void test() {
		Twitter tw = TweetInstance.instance();
		try {
			Status status = tw.updateStatus("Status dengan TweetApps");
			System.out.println("done created status "+status.getText());
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
