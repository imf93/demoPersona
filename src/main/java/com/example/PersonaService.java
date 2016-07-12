package com.example;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by professor on 20/06/2016.
 */
@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public void testPersonas(){
        Persona persona = new Persona();
        persona.setNombre("Ivan");
        persona.setEdad(23);
        personaRepository.save(persona);

        Persona persona2 = new Persona();
        persona2.setNombre("Dimple");
        personaRepository.save(persona2);
        persona2.setEdad(25);
        Persona persona3 = new Persona();

        persona3.setNombre("Noelia");
        persona3.setApellido("Villa");
        persona3.setEdad(25);
        personaRepository.save(persona3);

        Persona persona4 = new Persona();
        persona4.setNombre("Noelia");
        persona4.setApellido("Hernan");


        persona4.setEdad(25);
        personaRepository.save(persona4);


        Persona persona5 = new Persona();
        persona5.setNombre("Ricard");
        persona5.setApellido("Hernandez");
        persona5.setEdad(22);
        personaRepository.save(persona5);

        System.out.println(personaRepository.findOne(2L));

        System.out.println(personaRepository.findByNombre("Noelia"));

        System.out.println("Mostrar todas las personas cuya edad es>=22");
        System.out.println(personaRepository.findByEdadGreaterThanEqual(23));

        System.out.println("Mostramos todas las personas que se llamen Noelia Villa");
        System.out.println(personaRepository.findByNombreAndApellido("Noelia", "Villa"));

        System.out.println("Mostramos todas las personas que se llamen Noelia o bien el apellido sea Villa");
        System.out.println(personaRepository.findByNombreOrApellido("Noelia", "Villa"));





    }
}
