package service;

/**
 * Created by AHernandezS on 4/11/2017.
 */
public interface TouresBalonService {

    ResponseCreateOrder createOrder(CreateOrder requestCreateOrder);

    boolean updateOrderStatus(UpdateOrderStatus requestUpdateOrderStatus);


}