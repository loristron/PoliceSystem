/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class MelianteDao {

    private static Connection connection = ConnectionFactory.getConnection();    

    public static void deletaTudo() throws SQLException {
        String sql = "TRUNCATE fichapolicial";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        System.out.println("Todas os dados foram deletados.");
    }

    public static void adiciona(Meliante meliante) {
        String sql = "INSERT into fichapolicial " + "(nome, cpf, endereco, delito, data, hora, local, estado, foto)" + " values(?,?,?,?,?,?,?,?,?)";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores
            stmt.setString(1, meliante.getNome());
            stmt.setString(2, meliante.getCpf());
            stmt.setString(3, meliante.getEndereco());
            stmt.setString(4, meliante.getDelito());
            stmt.setDate  (5, new Date(meliante.getData().getTimeInMillis()));
            stmt.setString(6, meliante.getHora());
            stmt.setString(7, meliante.getLocal());
            stmt.setString(8, meliante.getEstado());
            stmt.setString(9, meliante.getFoto());
            // executa
            stmt.execute();
            stmt.close();
            System.out.println("Adicionou o meliante: " + meliante.getNome());
            meliante.setId(getIdFromMeliante());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void alteraMeliante(Meliante meliante) {
        String sql = "UPDATE fichapolicial SET nome = ?, cpf = ?, endereco = ?, delito = ?, data = ?, hora = ?, local = ?, estado = ?, foto = ? WHERE id = ?";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores
            stmt.setString(1, meliante.getNome());
            stmt.setString(2, meliante.getCpf());
            stmt.setString(3, meliante.getEndereco());
            stmt.setString(4, meliante.getDelito());
            stmt.setDate  (5, new Date(meliante.getData().getTimeInMillis()));
            stmt.setString(6, meliante.getHora());
            stmt.setString(7, meliante.getLocal());
            stmt.setString(8, meliante.getEstado());
            stmt.setString(9, meliante.getFoto());
            stmt.setInt  (10, meliante.getId());
            

            // executa
            stmt.execute();
            stmt.close();
            System.out.println("Update no contato: " + meliante.getNome());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void removeMeliante(Meliante meliante) {
        String sql = "DELETE FROM fichapolicial " + " WHERE id = ?";
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores            
            stmt.setInt(1, meliante.getId());

            // executa
            stmt.execute();
            stmt.close();
            System.out.println("Deletou o meliante: " + meliante.getNome());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getIdFromMeliante() throws SQLException {
        String sql = "SELECT MAX(id) FROM fichapolicial";
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        int id = 0;
        while (rs.next()) {
            id = rs.getInt("MAX(id)");
        }
        rs.close();
        stmt.close();

        return id;
    }

    public static ArrayList<Meliante> getLista() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("SELECT * from fichapolicial");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Meliante> fichapolicial = new ArrayList< Meliante>();

        while (rs.next()) {
            // criando o objeto Meliante
            Meliante meliante = new Meliante();
            meliante.setId(rs.getInt("id"));
            meliante.setNome(rs.getString("nome"));
            meliante.setCpf(rs.getString("cpf"));
            meliante.setEndereco(rs.getString("endereco"));
            meliante.setDelito(rs.getString("delito"));
            Calendar data = Calendar.getInstance();
            data.setTime(rs.getDate("data"));
            meliante.setData(data);
            meliante.setHora(rs.getString("hora"));
            meliante.setLocal(rs.getString("local"));
            meliante.setEstado(rs.getString("estado"));
            meliante.setFoto(rs.getString("foto"));

            // adicionando o objeto à lista
            fichapolicial.add(meliante);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }
    public static ArrayList<Meliante> getListaOrdenadaDelito() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("SELECT * from fichapolicial ORDER BY delito, nome");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Meliante> fichapolicial = new ArrayList< Meliante>();

        while (rs.next()) {
            // criando o objeto Meliante
            Meliante meliante = new Meliante();
            meliante.setId(rs.getInt("id"));
            meliante.setNome(rs.getString("nome"));
            meliante.setCpf(rs.getString("cpf"));
            meliante.setEndereco(rs.getString("endereco"));
            meliante.setDelito(rs.getString("delito"));
            Calendar data = Calendar.getInstance();
            data.setTime(rs.getDate("data"));
            meliante.setData(data);
            meliante.setHora(rs.getString("hora"));
            meliante.setLocal(rs.getString("local"));
            meliante.setEstado(rs.getString("estado"));
            meliante.setFoto(rs.getString("foto"));

            // adicionando o objeto à lista
            fichapolicial.add(meliante);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }
    
    public static ArrayList<Meliante> getListaOrdenadaNome() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("SELECT * from fichapolicial ORDER BY nome");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Meliante> fichapolicial = new ArrayList< Meliante>();

        while (rs.next()) {
            // criando o objeto Meliante
            Meliante meliante = new Meliante();
            meliante.setId(rs.getInt("id"));
            meliante.setNome(rs.getString("nome"));
            meliante.setCpf(rs.getString("cpf"));
            meliante.setEndereco(rs.getString("endereco"));
            meliante.setDelito(rs.getString("delito"));
            Calendar data = Calendar.getInstance();
            data.setTime(rs.getDate("data"));
            meliante.setData(data);
            meliante.setHora(rs.getString("hora"));
            meliante.setLocal(rs.getString("local"));
            meliante.setEstado(rs.getString("estado"));
            meliante.setFoto(rs.getString("foto"));
            // adicionando o objeto à lista
            fichapolicial.add(meliante);
        }

        rs.close();
        stmt.close();
        return fichapolicial;
    }
    

}
