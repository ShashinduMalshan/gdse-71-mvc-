/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.dto.customerDto;
import edu.ijse.mvc.model.ItemModel;
import edu.ijse.mvc.model.customerModel;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author shasidu
 */
public class customerController {
    private final customerModel CUSTOMER_MODEL;

    public customerController() {
        this.CUSTOMER_MODEL = new customerModel();
    }
    
    public ArrayList<customerDto> getAllCustomer() throws SQLException, ClassNotFoundException{
        ArrayList<customerDto> customerDto = CUSTOMER_MODEL.getAll();
        return customerDto;
    }
     public String saveCustomer(customerDto customerDto) throws SQLException, ClassNotFoundException{
        String resp = CUSTOMER_MODEL.save(customerDto);
        return resp;
    }
    
    
    public String updateCustomer(customerDto customerDto) throws SQLException, ClassNotFoundException{
        String resp = CUSTOMER_MODEL.update(customerDto);
        return resp;
    }
     public customerDto searchCustomer(String CustID) throws SQLException, ClassNotFoundException{
        customerDto dto = CUSTOMER_MODEL.getCustomer(CustID);
        return dto;
    }
     public String deleteCustomer(String CustID) throws SQLException, ClassNotFoundException{
        String del = CUSTOMER_MODEL.clearCustomer(CustID);
        return del;
    }
    
}
