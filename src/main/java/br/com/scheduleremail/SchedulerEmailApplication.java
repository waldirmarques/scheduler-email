package br.com.scheduleremail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.MessagingException;
import java.io.IOException;

@SpringBootApplication
public class SchedulerEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerEmailApplication.class, args);

		SchedulingTask scheduling = new SchedulingTask();
		scheduling.schedulesSendEmail();
	}

}
