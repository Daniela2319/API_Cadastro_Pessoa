package me.dio.D.Java.com.IA_GFT.controller;

import me.dio.D.Java.com.IA_GFT.model.Pessoa;
import me.dio.D.Java.com.IA_GFT.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;
    @GetMapping
    public List<Pessoa> getAllPessoas () {
        return pessoaRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable Long id){
        Optional<Pessoa>pessoa = pessoaRepository.findById(id);
        return pessoa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pessoa createPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable Long id, @RequestBody Pessoa pessoaDetails) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        if (pessoa.isPresent()) {
            Pessoa p = pessoa.get();
            p.setNome(pessoaDetails.getNome());
            p.setEmail(pessoaDetails.getEmail());
            p.setEndereco(pessoaDetails.getEndereco());
            p.setTelefone(pessoaDetails.getTelefone());
            final Pessoa updatedPessoa = pessoaRepository.save(p);
            return ResponseEntity.ok(updatedPessoa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoa(@PathVariable Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        if (pessoa.isPresent()) {
            pessoaRepository.delete(pessoa.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
