/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan26_waktusaatini;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat Program Menampilkan Tanggal dan Waktu
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class PBO3_10117109_Latihan26_WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
	Calendar cal = Calendar.getInstance();
	int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);

	SimpleDateFormat formatIndo = new SimpleDateFormat("dd MM yyyy HH:mm:ss");

	String[] strDays = new String[] {"Sabtu","Minggu","Senin","Selasa","Rabu","Kamis","Jumat"};

        System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+", "+formatIndo.format(date));
    }
    
}
