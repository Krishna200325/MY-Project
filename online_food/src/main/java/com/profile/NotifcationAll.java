package com.profile;

import main.java.com.NotificationService;

@SpringBootApplication
public class NotifcationAll {

	public static void main(String[] args) {


		ApplicationContext context =	SpringApplication.run(NotifcationAll.class, args);

	NotificationService service=	context.getBean(NotificationService.class);
	service.sendNotification();
	}

}
