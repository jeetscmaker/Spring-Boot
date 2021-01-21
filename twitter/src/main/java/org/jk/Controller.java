package org.jk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import twitter4j.Twitter;
import twitter4j.TwitterException;

@RestController
public class Controller {
	
	@Autowired
	Twitter twitter;

	@GetMapping("/run")
	public String tweet() {
		return "Hello Twitter!";
	}
	
	@GetMapping("/tweet")
	public String createTweet() throws TwitterException {
		String tweet = "";
		for (int i = 1809; i <= 1900; i++) {
			tweet = "Tweet-" + i + "\n #SushantDay \nSushant: A personality larger than life.";
			twitter.updateStatus(tweet);
		}
	    return "Thanks";
	}

}
