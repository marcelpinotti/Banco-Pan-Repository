package app;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.sql.*;

class LambdaRdsMySqlHandler implements RequestHandler<Object, String> {
    public String handleRequest(Object input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("");
        String currentTime = "unavailable";
        try {
            String username = "*******";
            String password = "*******";
            String dbName = "dblambda";
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + "database-1.*********.********.rds.amazonaws.com" + ":" + 3306 + "/" + dbName + "?useSSL=false", username, password);
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT NOW()");
            if (resultSet.next()) {
                currentTime = resultSet.getObject(1).toString();
            }
            
            logger.log("Sucesso: " + currentTime + "\n");
            
        } catch (SQLException e) {
        	logger.log("Exce��o: " + e.getMessage() + "\n");
        }

        return currentTime;
    }
}
