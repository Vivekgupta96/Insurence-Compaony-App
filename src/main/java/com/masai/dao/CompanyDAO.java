package com.masai.dao;

import java.util.List;

import com.masai.entity.Company;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWentWrongException;

public interface CompanyDAO {
	void addCompany(Company company) throws SomeThingWentWrongException;
	List<Company> getCompanyList() throws SomeThingWentWrongException, NoRecordFoundException;
	void updateCompany(Company company) throws SomeThingWentWrongException, NoRecordFoundException;
	Company getCompanyObjectByName(String companyName) throws SomeThingWentWrongException, NoRecordFoundException;
}
