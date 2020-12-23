package org.jk.redispubsub.controller;

import java.util.List;

import org.jk.redispubsub.configuration.RedisMessagePublisher;
import org.jk.redispubsub.configuration.RedisMessageSubscriber;
import org.jk.redispubsub.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/redis")
public class RedisController {

	private static Logger logger = LoggerFactory.getLogger(RedisController.class);

	@Autowired
	private RedisMessagePublisher messagePublisher;

	@PostMapping("/publish")
	public void publish(@RequestBody Message message) {
		logger.info(">> publishing : {}", message);
		messagePublisher.publish(message.toString());
	}

	@GetMapping("/subscribe")
	public List<String> getMessages() {
		return RedisMessageSubscriber.messageList;
	}

}
