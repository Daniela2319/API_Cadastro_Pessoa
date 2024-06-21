package me.dio.D.Java.com.IA_GFT.repository;

import me.dio.D.Java.com.IA_GFT.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
