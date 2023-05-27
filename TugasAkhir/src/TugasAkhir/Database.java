/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAkhir;

import java.awt.HeadlessException;
import java.io.Serializable;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author salome
 */
public class Database implements Serializable {
    public static Database instance;
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "tapbo";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
    
    private Database() {
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public void insertAnggota(Anggota anggota) throws SQLException {
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO member (nama, nim, angkatan, gender, role, keanggotaan) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, anggota.getNama());
            ps.setString(2, anggota.getNim());
            ps.setInt(3, anggota.getAngkatan());
            ps.setString(4, anggota.getGender());
            ps.setString(5, anggota.getRole());
            ps.setString(6, anggota.getKeanggotaan());
            ps.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public List<Anggota> getListAnggota() throws SQLException{
        List<Anggota> aggtList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM member order by angkatan, role, nim";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Anggota aggt = new Anggota();
                aggt.setNim(rs.getString("nim"));
                aggt.setNama(rs.getString("nama"));
                aggt.setGender(rs.getString("gender"));
                aggt.setAngkatan(rs.getInt("angkatan"));
                aggt.setRole(rs.getString("role"));
                aggt.setKeanggotaan(rs.getString("keanggotaan"));
                aggtList.add(aggt);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return aggtList;
    }
    
    public void deleteAnggota(String NIM) throws SQLException {
        Connection conn = getConnection();
        try{
            String sql="DELETE FROM member WHERE NIM = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, NIM);
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void editAnggota(Anggota aggt, String nim) throws SQLException {
        Connection conn = getConnection();
        try{
            String sql="UPDATE member SET nama=?, nim=?, angkatan=?, gender=?, role=?, keanggotaan=? WHERE nim = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, aggt.getNama());
            ps.setString(2, aggt.getNim());
            ps.setInt(3, aggt.getAngkatan());
            ps.setString(4, aggt.getGender());
            ps.setString(5, aggt.getRole());
            ps.setString(6, aggt.getKeanggotaan());
            ps.setString(7, nim);
            ps.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public String generateID() throws SQLException{
        Connection conn = getConnection();
        String sqlkode = "SELECT * from inventaris order by id DESC";
        Statement skode = conn.createStatement();
        ResultSet rs = skode.executeQuery(sqlkode);
        if(rs.next()){
            String kode = rs.getString("id").substring(1);
            String AN = "" + (Integer.parseInt(kode) + 1);
            return switch (AN.length()) {
                case 1 -> "X000"+AN;
                case 2 -> "X00"+AN;
                case 3 -> "X0"+AN;
                default -> "X" + AN;
            };
        } else {
            return  "X0001";
        }
    }
    
    public void insertBarang(Inventaris invet) throws SQLException {
        Connection conn = getConnection();
        try{
            String sql = "INSERT INTO inventaris (id, nama, jumlah, sumber, keadaan) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, this.generateID());
            ps.setString(2, invet.getNama());
            ps.setInt(3, invet.getJumlah());
            ps.setString(4, invet.getSumber());
            ps.setString(5, invet.getKeadaan());
            ps.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public List<Inventaris> getListBarang() throws SQLException {
        List<Inventaris> invetList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM inventaris order by id";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Inventaris invet = new Inventaris();
                invet.setId(rs.getString("id"));
                invet.setNama(rs.getString("nama"));
                invet.setJumlah(rs.getInt("jumlah"));
                invet.setSumber(rs.getString("sumber"));
                invet.setKeadaan(rs.getString("keadaan"));
                invetList.add(invet);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return invetList;
    }
    
    public void deleteBarang(String id) throws SQLException {
        Connection conn = getConnection();
        try{
            String sql="DELETE FROM inventaris WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public void editBarang(Inventaris invet, String id) throws SQLException {
        Connection conn = getConnection();
        try{
            String sql="UPDATE inventaris SET nama=?, jumlah=?, sumber=?, keadaan=? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, invet.getNama());
            ps.setInt(2, invet.getJumlah());
            ps.setString(3, invet.getSumber());
            ps.setString(4, invet.getKeadaan());
            ps.setString(5, invet.getId());
            ps.executeUpdate();
        } catch(SQLException ex){
            throw ex;
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
    
    public String[] genBand() throws SQLException{
        String[] band = new String[5];
        List<String> vokal = new ArrayList<>();
        List<String> gitar = new ArrayList<>();
        List<String> piano = new ArrayList<>();
        List<String> bass = new ArrayList<>();
        List<String> drum = new ArrayList<>();
        Random random = new Random();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM member where role = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Vokal");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String v = rs.getString("nama");
                vokal.add(v);
            }
            int select = random.nextInt(vokal.size()); 
            band[0]=vokal.get(select);
            
            ps.setString(1, "Gitar");
            rs = ps.executeQuery();
            while(rs.next()){
                String g = rs.getString("nama");
                gitar.add(g);
            }
            select = random.nextInt(gitar.size()); 
            band[1]=gitar.get(select);
            
            ps.setString(1, "Piano");
            rs = ps.executeQuery();
            while(rs.next()){
                String p = rs.getString("nama");
                piano.add(p);
            }
            select = random.nextInt(piano.size()); 
            band[2]=piano.get(select);
            
            ps.setString(1, "Bass");
            rs = ps.executeQuery();
            while(rs.next()){
                String b = rs.getString("nama");
                bass.add(b);
            }
            select = random.nextInt(bass.size()); 
            band[3]=bass.get(select);
            
            ps.setString(1, "Drum");
            rs = ps.executeQuery();
            while(rs.next()){
                String d = rs.getString("nama");
                drum.add(d);
            }
            select = random.nextInt(drum.size()); 
            band[4]=drum.get(select);
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
            }
        }
        return band;
    }
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }

}
