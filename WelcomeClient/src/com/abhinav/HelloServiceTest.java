package com.abhinav;

import java.rmi.RemoteException;

import com.abhinav.example.HelloServiceStub;
import com.abhinav.example.HelloServiceStub.SayHello;
import com.abhinav.example.HelloServiceStub.SayHelloResponse;

public class HelloServiceTest {
	
	public static void main(String[] args) {
		
		
		try {
			HelloServiceStub service = new HelloServiceStub();
			SayHello request = new SayHello();
			request.setName("Abhinav");
			SayHelloResponse response = service.sayHello(request);
			System.out.println(response.get_return());
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
