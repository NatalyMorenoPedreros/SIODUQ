package com.uniquindio.trabajogrado.SIODUQ.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

    @Autowired
    private JavaMailSender correo;

    public void sendEmail(List<String> destinatarios, String asunto, String mensaje) {

        for (String destinatario : destinatarios) {
            SimpleMailMessage email = new SimpleMailMessage();

            email.setTo(destinatario);
            email.setSubject(asunto);
            email.setText(mensaje);

            correo.send(email);
        }
    }
}
