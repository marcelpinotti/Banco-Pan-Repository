package com.aws.lambda.mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.lambda.mysql.data.RequestDetails;
import com.aws.lambda.mysql.data.ResponseDetails;
import com.amazonaws.services.lambda.runtime.Context;

public class MySqlConect implements RequestHandler<RequestDetails, ResponseDetails>
{
	
	private Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
				String url = "jdbc:mysql://database-1.*******.********.rds.amazonaws.com:3306";
				String username = "********";
				String password = "*********";
				Connection conn = DriverManager.getConnection(url, username, password);
				return conn;
	}
	

	private void insertDetails(RequestDetails requestDetails, ResponseDetails responseDetails) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		Connection connection = getConnection();
		
		Statement statement = connection.createStatement();
		
		String query = getquery(requestDetails);
		int responseCode = statement.executeUpdate(query);
		if(1 == responseCode)
		{
			responseDetails.setMensagemPessoa(String.valueOf(responseCode));
			responseDetails.setMensagemReacao("Pessoa inserida com sucesso!");
		}
		
	}
	private String getquery(RequestDetails requestDetails) {
		
		String query = "INSERT INTO dblambda.tb_marcel(nome, sobrenome, idade) VALUES (";
		
		query = query.concat("'" + requestDetails.getNome() + "','"  + requestDetails.getSobrenome() + "','" + requestDetails.getIdade() + "')");
		
	
		return query;
	}
	
	public ResponseDetails handleRequest(RequestDetails requestDetails, Context arg1) {
		
		
		ResponseDetails responseDetails = new ResponseDetails();
		try {
			insertDetails(requestDetails, responseDetails);
		} catch (SQLException sqlException) {
			responseDetails.setMensagemPessoa("N�o foi desta vez :..(");
			responseDetails.setMensagemReacao("Tente inserir novamente "+sqlException);
		}
		return responseDetails;
	}
	
}