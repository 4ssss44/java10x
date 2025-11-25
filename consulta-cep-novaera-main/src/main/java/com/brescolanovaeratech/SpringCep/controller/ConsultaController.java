package com.brescolanovaeratech.SpringCep.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.brescolanovaeratech.SpringCep.domain.CepDomain;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    
        @GetMapping("/{cep}")
        public CepDomain consultaCep(@PathVariable("cep") String cep) {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<CepDomain> resp = restTemplate.getForEntity(
                    String.format("https://viacep.com.br/ws/%s/json", cep),
                    CepDomain.class
            );
            return resp.getBody();
        }

}
