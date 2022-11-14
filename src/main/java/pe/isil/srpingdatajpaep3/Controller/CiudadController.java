package pe.isil.srpingdatajpaep3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.isil.srpingdatajpaep3.Entity.Ciudad;
import pe.isil.srpingdatajpaep3.Entity.Cliente;
import pe.isil.srpingdatajpaep3.Service.CiudadService;

import java.util.List;


@RestController
@RequestMapping("/direccion")
public class CiudadController {
    @Autowired
    private CiudadService ciudadService;

}

