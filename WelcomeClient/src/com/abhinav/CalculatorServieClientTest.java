package com.abhinav;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.abhinav.example.CalculatorServiceStub;
import com.abhinav.example.CalculatorServiceStub.Add;
import com.abhinav.example.CalculatorServiceStub.AddResponse;

public class CalculatorServieClientTest {

	
	public static void main(String[] args) {
		
		
		try {
			CalculatorServiceStub service = new CalculatorServiceStub();
			Add request = new Add();
			request.setA(30);
			request.setB(20);
			AddResponse response = service.add(request);
			System.out.println(response.get_return());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
