package com.mcc.crud;

import com.mcc.crud.controllers.RegionController;
import com.mcc.crud.services.RegionServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	        System.out.println("Sudah bisa");
                RegionController con= new RegionController();
                RegionServices regionservices = null;
                
                System.out.println(regionservices.findbyid(Integer.parseInt("4")));
        }

}
