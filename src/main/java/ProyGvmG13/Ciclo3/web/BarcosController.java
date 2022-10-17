package ProyGvmG13.Ciclo3.web;

import ProyGvmG13.Ciclo3.model.Barcos;
import ProyGvmG13.Ciclo3.services.BarcosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Barcos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class BarcosController {

    @Autowired
    private BarcosService barcosService;

    @GetMapping("/all")
    public List<Barcos> getBarcos(){
        return barcosService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Barcos> getBarcos(@PathVariable("id") int id){
        return barcosService.getBarcos(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Barcos save(@RequestBody Barcos p){
        return barcosService.save(p);
    }
}
