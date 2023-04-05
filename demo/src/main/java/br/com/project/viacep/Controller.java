package br.com.project.viacep;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/endereco")
@RestController
public class Controller {

    private final Service service;

    @GetMapping("/consulta")
    public ResponseEntity consultaCep(@RequestBody Request enderecoRequest){
        return ResponseEntity.ok(service.executa(enderecoRequest));
    }
}
