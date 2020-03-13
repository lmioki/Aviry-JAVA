package aviry_java;

import java.sql.PreparedStatement;

public class User {
	private int id;
	private String first_name;
	private String last_name;
	private String address;
	private String zip_code;
	private String CPF;
	private String RG;
	
	public void criarUsuario() {
		String sql = "INSERT INTO t_usuario (first_name, last_name, address, zip_code, CPF, RG) VALUES ()";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
	}
}


	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

