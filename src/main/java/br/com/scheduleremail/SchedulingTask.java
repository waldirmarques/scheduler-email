package br.com.scheduleremail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class SchedulingTask {

    @Autowired
    private JavaMailSender javaMailSender;
    private final long MINUT = 1000 * 60;

    @Scheduled(fixedDelay = MINUT)
    public void schedulesSendEmail() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("marni1538@uorak.com"); // emeil de destino

        msg.setSubject("Testing from Spring Boot"); // assunto do email
        msg.setText("Hello World \n Spring Boot Email"); // texto do email

        javaMailSender.send(msg);
    }
}
