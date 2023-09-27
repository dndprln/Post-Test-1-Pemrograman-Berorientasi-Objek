/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author adinda
 */

// Import statement untuk mengakses ArrayList
import java.util.ArrayList;

// Deklarasi kelas ProdukKosmetik
public class Produk_Kosmetik {
    // Properties (Atribut atau Variabel)
    public String nama;      // Nama produk kosmetik
    public double harga;     // Harga produk kosmetik
    public String jenis;     // Jenis produk kosmetik (Foundation, Compact Powder, Concealer, dll)

    // Constructor (Konstruktor)
    // Ini adalah method khusus yang digunakan untuk membuat objek ProdukKosmetik.
    // Constructor menerima beberapa parameter dan menginisialisasi atribut-atribut objek.
    public Produk_Kosmetik(String nama, double harga, String jenis) {
        this.nama = nama;     // Inisialisasi atribut nama
        this.harga = harga;   // Inisialisasi atribut harga
        this.jenis = jenis;   // Inisialisasi atribut jenis
    }

    // Method (Fungsi atau Metode)
    // Ini adalah metode yang digunakan untuk menampilkan informasi produk kosmetik ke layar.
    public void menampilkan_output() {
        // Menampilkan pesan yang mencakup nama, jenis, dan harga produk kosmetik.
        System.out.println("Produk Kosmetik: " + nama + " (" + jenis + ") dengan harga Rp. " + harga + ".");
    }

    // Method utama (main)
    public static void main(String[] args) {
        // Buat ArrayList untuk menyimpan objek ProdukKosmetik
        ArrayList<Produk_Kosmetik> ListProdukKosmetik = new ArrayList<>();

        // Inisialisasi ArrayList dengan beberapa objek ProdukKosmetik
        ListProdukKosmetik.add(new Produk_Kosmetik("Maybelline Fit Me Matte Poreless  productnation", 150000, 
                                                  "Foundation"));
        ListProdukKosmetik.add(new Produk_Kosmetik("L’Oreal Infallible Pro Matte", 110000, "Lipstick"));
        ListProdukKosmetik.add(new Produk_Kosmetik("Wardah EyeXpert Aqua Lash Mascara", 52000, "Mascara"));
        ListProdukKosmetik.add(new Produk_Kosmetik("Pink Flash ProTouch", 69000, "Eyeshadow Palette"));
        ListProdukKosmetik.add(new Produk_Kosmetik("Emina Cheeklit Cream Blush", 34000, "Blush On"));
        ListProdukKosmetik.add(new Produk_Kosmetik("Somethinc Forever Stay Waterproof Liquid", 66000, "Eyeliner"));
        ListProdukKosmetik.add(new Produk_Kosmetik("Rose All Day Cosmetics The Realest Lightweight productnation", 112000,
                                                  "Compact Powder"));        
        ListProdukKosmetik.add(new Produk_Kosmetik("Focallure Brow Gel Cream", 78000, "Eyebrow Gel"));
        ListProdukKosmetik.add(new Produk_Kosmetik("Y.O.U The Simplicity Love You Tint", 49000, "Lip Tint"));        
        ListProdukKosmetik.add(new Produk_Kosmetik("Madame Gie Madame Lippie Slicks", 25000, "Lip Gloss")); 
        
        
        // Perulangan (Loop) untuk menampilkan informasi produk kosmetik dari ArrayList
        for (Produk_Kosmetik produk : ListProdukKosmetik) {
            produk.menampilkan_output(); // Memanggil metode tampilkanInfo() untuk setiap objek dalam ArrayList
        }
    }
}