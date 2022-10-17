package ProyGvmG13.Ciclo3.services;

import ProyGvmG13.Ciclo3.model.Barcos;
import ProyGvmG13.Ciclo3.repository.BarcosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarcosService {

    @Autowired
    private BarcosRepository barcosRepository;

    public List<Barcos> getAll(){
        return barcosRepository.getAll();
    }
    public Optional<Barcos> getBarcos(int id){
        return barcosRepository.getBarcos(id);
    }
    public Barcos save(Barcos p){
        if(p.getId()==null){
            return barcosRepository.save(p);
        }else{
            Optional<Barcos> paux=barcosRepository.getBarcos(p.getId());
            if(paux.isPresent()){
                return paux.get();
            }else{
                return barcosRepository.save(p);
            }
        }
    }
}
