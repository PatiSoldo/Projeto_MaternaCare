package com.generation.MaternaCare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.MaternaCare.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	public List<Usuario> findAllByNomeUsuarioContainingIgnoreCase(String nomeUsuario);

}
