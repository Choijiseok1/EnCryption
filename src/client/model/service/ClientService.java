package client.model.service;

import static common.JDBCTemplate.*;

import client.model.dao.ClientDao;
import client.model.vo.*;

import java.sql.*;

public class ClientService {
	public ClientService() {}
	
	public Client loginCheck(String userId, String userPwd) {
		Connection con = getConnection();
		Client client = new ClientDao().loginCheck(con, userId, userPwd);
		close(con);
		return client;
	}
	
	public int insertClient(Client client) {
		Connection con = getConnection();
		int result = new ClientDao().insertClient(con, client);
		if(result > 0)
			commit(con);
		else
			rollback(con);
		close(con);
		return result;
	}
	
	public Client selectClient(String userId) {
		Connection con = getConnection();
		Client client = new ClientDao().selectClient(con, userId);
		close(con);
		return client;
	}
}










