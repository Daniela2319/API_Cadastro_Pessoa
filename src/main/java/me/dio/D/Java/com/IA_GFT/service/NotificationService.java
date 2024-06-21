package me.dio.D.Java.com.IA_GFT.service;

import me.dio.D.Java.com.IA_GFT.model.Pessoa;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyAdminOfNewPerson(Pessoa pessoa) {
        // Simula a notificação para a equipe administrativa
        System.out.println("Admin Notified: Nova pessoa cadastrada - " + pessoa.getNome());
    }
}
