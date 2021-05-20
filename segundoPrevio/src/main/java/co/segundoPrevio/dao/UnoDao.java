package co.segundoPrevio.dao;

import java.sql.SQLException;
import java.util.List;

import co.segundoPrevio.util.ConexionMySQL;


public class UnoDao implements Dao1 {
	
	private ConexionMySQL c;
	private static final String INSERT_USUARIO_SQL = "INSERT INTO usuario (nombre, email, pais) VALUES (?, ?, ?);";
	private static final String DELETE_USUARIO_SQL = "DELETE FROM usuario WHERE id = ?;";
	private static final String UPDATE_USUARIO_SQL = "UPDATE usuario SET nombre = ?, email = ?, pais=? WHERE id = ?;";
	private static final String SELECT_USUARIO_BY_SQL = "SELECT * FROM usuario WHERE id = ?;";
	private static final String SELECT_ALL_USUARIOS = "SELECT * FROM usuario;";

	public UnoDao()
	{
		this.c = ConexionMySQL.getConexion();
	}
	
	@Override
	public void insert(Object o) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object select(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object o) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
