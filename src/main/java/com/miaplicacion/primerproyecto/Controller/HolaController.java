package com.miaplicacion.primerproyecto.Controller;

import com.miaplicacion.primerproyecto.Cliente.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HolaController {

    @GetMapping
    public String decirHola() {
        return "Hello World!";
    }

    @GetMapping("/hola/{nombre}/{edad}/{profesion}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable int edad,
                            @PathVariable String profesion) {
        return "Hola " + nombre + ", tienes " + edad + " años y tu profesión es " + profesion;
    }

    @GetMapping("/hola/req")
    public String decirHolaReq(@RequestParam String nombre,
                               @RequestParam int edad,
                               @RequestParam String profesion) {
        return "Hola " + nombre + ", tienes " + edad + " años y tu profesión es " + profesion;
    }

    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos cliente: " + cli.getNombre() +
                " Apellido: " + cli.getApellido());
    }

    @GetMapping("cliente/traer")
    @ResponseBody
    public ArrayList<Cliente> traerClientes(){

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente(1L, "Ana", "Marcela"));
        listaClientes.add(new Cliente(2L, "Adriana", "Beatriz"));
        listaClientes.add(new Cliente(3L, "Marta", "Elena"));

        return listaClientes;
    }

    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatus.OK);
    }


}
