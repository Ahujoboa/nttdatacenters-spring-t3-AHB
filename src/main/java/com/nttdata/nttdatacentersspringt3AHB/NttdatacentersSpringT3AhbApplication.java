package com.nttdata.nttdatacentersspringt3AHB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.nttdatacentersspringt3AHB.repository.Cliente;

@SpringBootApplication
public class NttdatacentersSpringT3AhbApplication {

	@Autowired
	List<Cliente> listaClientes;
	
	

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersSpringT3AhbApplication.class, args);
		
		
	
	}

}
