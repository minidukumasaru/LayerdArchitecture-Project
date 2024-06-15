package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;

    public void SaveAllCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public void UpdateAllCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void DeleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public boolean ExistCustomer(String id) throws SQLException, ClassNotFoundException;

    public String generateNextId() throws SQLException, ClassNotFoundException;
    public CustomerDTO SearchCustomer(String newValue) throws SQLException, ClassNotFoundException ;
    public ArrayList<String> loadCustomerIds() throws SQLException, ClassNotFoundException ;

}
