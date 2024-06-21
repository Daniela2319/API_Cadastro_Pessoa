package me.dio.D.Java.com.IA_GFT.service;

import me.dio.D.Java.com.IA_GFT.model.Pessoa;
import me.dio.D.Java.com.IA_GFT.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EmailService emailService;
    @Autowired
    private NotificationService notificationService;

    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa getPessoaById(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    @Transactional
    public Pessoa createPessoa(Pessoa pessoa) {
        Pessoa savedPessoa = pessoaRepository.save(pessoa);
        emailService.sendWelcomeEmail(savedPessoa);
        notificationService.notifyAdminOfNewPerson(savedPessoa);
        return savedPessoa;
    }

    @Transactional
    public Pessoa updatePessoa(Long id, Pessoa pessoaDetails) {
        return pessoaRepository.findById(id)
                .map(pessoa -> {
                    pessoa.setNome(pessoaDetails.getNome());
                    pessoa.setEmail(pessoaDetails.getEmail());
                    pessoa.setEndereco(pessoaDetails.getEndereco());
                    pessoa.setTelefone(pessoaDetails.getTelefone());
                    return pessoaRepository.save(pessoa);
                }).orElse(null);
    }

    @Transactional
    public void deletePessoa(Long id) {
        pessoaRepository.deleteById(id);
    }


}
