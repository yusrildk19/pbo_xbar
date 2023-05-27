/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasAkhir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salome
 */
public class Export {
    private String path;
    
    public Export(){
    }
    
    void setPath(String path){
        this.path = path;
    }
    
    String getPath (){
        return path;
    }
    
    public void exportAnggota(String path) throws IOException, SQLException{
        setPath(path);
        try{
            //menghubungi database
            List<Anggota> aggt = Database.getInstance().getListAnggota();
            //buat file kosong
            File csvOutput = new File(getPath());
            FileWriter filewriter = new FileWriter(csvOutput);

            //input header(nama kolom)
            insertAnggotaHeader(filewriter);

            //input tiap record ke dalam file
            insertAnggotaRow(aggt, filewriter);

            filewriter.close();
        }catch (IOException ex) {
            throw ex;
        } catch (SQLException ex){
            throw ex;
        }
           
    }
    
    private void insertAnggotaRow(List<Anggota> aggt, FileWriter filewriter){
        for(Anggota ag : aggt){
            StringBuilder line = new StringBuilder();            
            line.append(ag.getAngkatan()); line.append(',');
            line.append(ag.getNim()); line.append(',');
            line.append(ag.getNama()); line.append(',');
            line.append(ag.getGender()); line.append(',');
            line.append(ag.getRole()); line.append(',');
            line.append(ag.getKeanggotaan());
            
            //buat baris baru untuk record berikutnya
            line.append("\n");
            try {
                filewriter.write(line.toString());
            } catch (IOException ex) {
                Logger.getLogger(Export.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //mmethod ontuk input header
    private void insertAnggotaHeader(FileWriter filewriter){
        StringBuilder line = new StringBuilder();
        
        line.append("angkatan"); line.append(',');
        line.append("nim"); line.append(',');
        line.append("nama"); line.append(',');
        line.append("jenis_kelamin"); line.append(',');
        line.append("role"); line.append(',');
        line.append("keanggotaan");
        
        line.append("\n");
        try {
            filewriter.write(line.toString());
        } catch (IOException ex) {
            Logger.getLogger(Export.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exportBarang(String path) throws IOException, SQLException{
        setPath(path);
        try{
            //menghubungi database
            List<Inventaris> invet = Database.getInstance().getListBarang();
            //buat file kosong
            File csvOutput = new File(getPath());
            FileWriter filewriter = new FileWriter(csvOutput);

            //input header(nama kolom)
            insertBarangHeader(filewriter);

            //input tiap record ke dalam file
            insertBarangRow(invet, filewriter);

            filewriter.close();
        }catch (IOException ex) {
            throw ex;
        } catch (SQLException ex){
            throw ex;
        }
           
    }
    
    private void insertBarangRow(List<Inventaris> invet, FileWriter filewriter){
        for(Inventaris inve : invet){
            StringBuilder line = new StringBuilder();            
            line.append(inve.getId()); line.append(',');
            line.append(inve.getNama()); line.append(',');
            line.append(inve.getJumlah()); line.append(',');
            line.append(inve.getSumber()); line.append(',');
            line.append(inve.getKeadaan()); line.append(',');
            
            //buat baris baru untuk record berikutnya
            line.append("\n");
            try {
                filewriter.write(line.toString());
            } catch (IOException ex) {
                Logger.getLogger(Export.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //mmethod ontuk input header
    private void insertBarangHeader(FileWriter filewriter){
        StringBuilder line = new StringBuilder();
        
        line.append("id_barang"); line.append(',');
        line.append("nama_barang"); line.append(',');
        line.append("jumlah"); line.append(',');
        line.append("sumber_dana"); line.append(',');
        line.append("kondisi");
        
        line.append("\n");
        try {
            filewriter.write(line.toString());
        } catch (IOException ex) {
            Logger.getLogger(Export.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
