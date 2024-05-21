package com.chainsys.dao;

import java.sql.SQLException;

import com.chainsys.model.FormDetails;

public interface FormDAO{

	public void saveForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException;

	

}
