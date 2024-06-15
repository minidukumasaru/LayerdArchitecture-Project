package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> LoadAllItem() throws SQLException, ClassNotFoundException;


    public void SaveAllItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException;

    public int UpdateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public boolean ExistItem(String code) throws SQLException, ClassNotFoundException;

    public String generateNextId() throws SQLException, ClassNotFoundException;
    public ItemDTO FindItem(String newItemCode) throws SQLException, ClassNotFoundException ;
    public ArrayList<String> loadAllIds() throws SQLException, ClassNotFoundException ;

}
