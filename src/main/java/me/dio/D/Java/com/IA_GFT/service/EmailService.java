package me.dio.D.Java.com.IA_GFT.service;
import me.dio.D.Java.com.IA_GFT.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendWelcomeEmail(Pessoa pessoa){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(pessoa.getEmail());
        message.setSubject("Bem-vindo à Padaria!");
        message.setText("Olá " + pessoa.getNome() + ",\n\nObrigado por se cadastrar na nossa padaria!");

        mailSender.send(message);
    }
    }


