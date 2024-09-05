package br.senac.sp.backend.formulario.application.service.impl;

import br.senac.sp.backend.formulario.application.service.ServiceAqui;
import br.senac.sp.backend.formulario.application.usecase.UseCaseAqui;
import org.springframework.stereotype.Service;

@Service
public class ServiceAquiImpl implements ServiceAqui {

    private final UseCaseAqui useCaseAqui;

    public ServiceAquiImpl(UseCaseAqui useCaseAqui){
        this.useCaseAqui = useCaseAqui;
    }

}
