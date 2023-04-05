package br.com.project.viacep;


import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service {

     private final CepFeign cepFeign;
     cepResponse executa (Request request){
          return cepFeign.buscaCep(request.getCep());
     }
}
