/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.facade;

/**
 *
 * @author daniel2402
 */
public class ProxyClient {
    private IOrderService iOrderService;

    public ProxyClient(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }
    public void createOrder(){
        
    }
}