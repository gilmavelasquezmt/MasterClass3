package ProyGvmG13.Ciclo3.repository;

import ProyGvmG13.Ciclo3.model.Barcos;
import ProyGvmG13.Ciclo3.repository.crud.BarcoCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BarcosRepository {

    @Autowired
    private BarcoCrudRepository barcoCrudRepository;

    public List<Barcos> getAll(){
        return (List<Barcos>) barcoCrudRepository.findAll();
    }
    public Optional<Barcos> getBarcos(int id){
        return barcoCrudRepository.findById(id);
    }

    public Barcos save(Barcos p){
        return barcoCrudRepository.save(p);
    }

}

