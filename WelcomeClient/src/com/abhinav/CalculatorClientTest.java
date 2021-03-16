package com.abhinav;

import java.rmi.RemoteException;

import com.abhinav.example.CalculatorStub;
import com.abhinav.example.CalculatorStub.Add;
import com.abhinav.example.CalculatorStub.AddResponse;

public class CalculatorClientTest {

	
	public static void main(String[] args) {
		
		
		try {
			CalculatorStub service = new CalculatorStub();
			Add request = new Add();
			request.setA(30);
			request.setB(30);
			AddResponse response = service.add(request);
			System.out.println(response.get_return());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
