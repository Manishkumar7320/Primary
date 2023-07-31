package com.mvcflow.mvcspring.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcflow.mvcspring.bean.PrimaryData;
import com.mvcflow.mvcspring.repo.PrimaryRepositoy;

@Service
public class PrimaryService {

	@Autowired
	PrimaryRepositoy primaryRepositoy;

	public List<PrimaryData> getPrimaryDBResponse() {

		List<PrimaryData> primaryList = primaryRepositoy.findAll();

		return primaryList;

	}

	public int addService() {
		int a = 10;
		return ++a;

	}
}
