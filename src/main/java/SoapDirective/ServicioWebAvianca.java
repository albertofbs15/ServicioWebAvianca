package SoapDirective;

import service.CreateOrderRequest;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://com.javeriana.aes.pica/ServicioWebAvianca/orders")
public class ServicioWebAvianca {

	private static int order = 0;

	@WebMethod(operationName = "crearReserva", action = "crearReserva")
	public int createOrder(CreateOrderRequest createOrderRequest)  {
		return order++;
	}

	@WebMethod(operationName = "cancelarVuelo", action = "cancelarVuelo")
	public boolean cancelarOrder(int orderId)  {
		return true;
	}
	 
}
