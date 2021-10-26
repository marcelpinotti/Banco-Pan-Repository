package br.com.marcelpinotti.app1.service;

import br.com.marcelpinotti.app1.model.Usuario;
import br.com.marcelpinotti.app1.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getById(Long id){
        return usuarioRepository.findById(id);
    }
}
