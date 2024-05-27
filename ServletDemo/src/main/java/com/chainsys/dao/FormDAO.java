package com.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import com.chainsys.model.FormDetails;

public interface FormDAO{

	public void saveForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException;
	public List<FormDetails> readForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException;
	public void updateForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException;
    public void deleteForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException;
    public List<FormDetails> searchForm(FormDetails formDetails1) throws ClassNotFoundException, SQLException;
}
