package pe.isil.srpingdatajpaep3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.srpingdatajpaep3.Entity.Ciudad;
import pe.isil.srpingdatajpaep3.Repository.CiudadRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {


    @Autowired
    private CiudadRepository ciudadRepository;

    public void addCiudad(Ciudad ciudad){
        ciudadRepository.save(ciudad);
    }

    public List<Ciudad> getAllCategories(){
        return ciudadRepository.findAll();
    }

    public Ciudad getCiudadById(Long id){

        Optional<Ciudad> category = ciudadRepository.findById(id);

        if(category.isPresent())
        {
            return category.get();
        }else{
            return null;
        }

    }

}

