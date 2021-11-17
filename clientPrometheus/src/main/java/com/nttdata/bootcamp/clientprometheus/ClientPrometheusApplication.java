package com.nttdata.bootcamp.clientprometheus;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.clientprometheus.services.Service;



@SpringBootApplication
public class ClientPrometheusApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ClientPrometheusApplication.class, args);
	}

	
@Override
	
	public void run (String ...args) throws Exception{
		
		Service Service = new Service();
		
		String open = "open";
		String close = "close";
		String  halFopen= "half-open";
		
		Cliente cliente = new ClienteBuilder()
				.Status(open)
				.nombre("Jose")
				.apellidos("Portero").build();
			
		
				
		for(int i=0; i <= 5 && cliente.getStatus().equals(open); i++) {
			cliente.setStatus(halFopen);
			Service.setTohalFopen();
			Thread.sleep(3000);
			if(i >= 3) {
				cliente.setStatus(close);
				Service.setToClose();
				Thread.sleep(3000);
			}else {
				cliente.setStatus(open);
				Service.setToClose();
				Thread.sleep(3000);
			}
			
		}
				
		
		
		    
	}
}
