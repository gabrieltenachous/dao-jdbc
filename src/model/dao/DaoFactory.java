package model.dao;

import model.dao.impl.SellerDaoImplJDBC;

public class DaoFactory {
	
	public static SellerDaoImplJDBC createSellerDao() {
		return (SellerDaoImplJDBC) new SellerDaoImplJDBC();
	}
}
