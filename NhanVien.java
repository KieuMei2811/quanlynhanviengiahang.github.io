package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien extends Person {
    private String maNV;
    private char gender;
    private float luong;
    private String phone;
    private String donHang;
    
    Scanner input = new Scanner(System.in);

  
public NhanVien()
    {
    super();
    }

public void NhapNhanVien(ArrayList<NhanVien> ds)
    {
        System.out.println("Nhap So Luong Nhan Vien");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i<n; i++){
        System.out.println("Nhap Thong Tin Thu "+(i+1));
        System.out.print("Nhap Ma Nhan Vien: ");
        maNV = input.nextLine();
        System.out.print("\nNhap Ho Ten Nhan Vien: ");
        super.setTen(input.nextLine());
        System.out.print("\nNhap Tuoi Nhan Vien: ");
        super.setTuoi(input.nextInt());
        input.nextLine(); // Lôi bộ đệm lên để có thể chạy dòng giới tính
        System.out.print("\nNhap Gioi Tinh Nhan Vien: ");
        gender = input.nextLine().charAt(0);
        System.out.print("\nNhap Luong Nhan Vien: ");
        luong = input.nextFloat(); 
        input.nextLine(); // Lôi bộ đệm lên để có thể chạy dòng SDT
        System.out.print("\nNhap So Dien Thoai Nhan Vien: ");
        phone = input.nextLine();
        System.out.print("\nNhap Ten Don Hang Nhan Vien Giao: ");
        donHang = input.nextLine();
        ds.add(new NhanVien(getMaNV(), getTen(),getTuoi(), getGender(), getLuong(), getPhone(), getdonHang()));
        }
    } 


void Show()
 {
   System.out.printf("\n %12s %13s %5d %5s %10.3f %13s %13s ",getMaNV(),getTen(),getTuoi(),getGender(),getLuong(),getPhone(),getdonHang());
 }


public NhanVien(String maNV, String ten, int tuoi) 
 {
    super(ten, tuoi);
    this.maNV = maNV;
 }
 public NhanVien(String maNV, String ten, int tuoi, char gender,  float luong, String phone, String donHang) 
 {
    super(ten, tuoi);
    this.maNV = maNV;
    this.gender = gender;
    this.luong = luong;
    this.phone = phone;
    this.donHang = donHang;
   
 }
 
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public float getLuong() {
        return luong;
    }
    public void setluong(float luong){
     this.luong= luong ;
    }
    public void setDiem(float luong) {
        this.luong = luong;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getdonHang(){
        return donHang;
    }
    public void setdonHang(String donHang){
        this.donHang = donHang;
 
    }
   
    @Override
    public String toString() 
    {
        return 
             " "+maNV +" "+ getTen()+" "+ getTuoi()+ " "+ gender + " "+luong + " "+phone +" "+ donHang ;            
    }
  
    public  void Add(ArrayList<NhanVien> ds)
    {
      System.out.println(" Nhap So Luong NV Muon Them:");
      int n = input.nextInt();
      input.nextLine();
      for ( int i= 0; i<n;i++){
        System.out.println("Nhap Thong Tin NV Thu "+(1+i)+" :");
        System.out.print("Nhap Ma Nhan Vien: ");
        maNV = input.nextLine();
        System.out.print("\nNhap Ho Ten Nhan Vien: ");
        super.setTen(input.nextLine());
        System.out.print("\nNhap Tuoi Nhan Vien: ");
        super.setTuoi(input.nextInt());
        input.nextLine(); // Lôi bộ đệm lên để có thể chạy dòng giới tính
        System.out.print("\nNhap Gioi Tinh Nhan Vien: ");
        gender = input.nextLine().charAt(0);
        System.out.print("\nNhap Luong Nhan Vien: ");
        luong = input.nextFloat(); 
        input.nextLine(); // Lôi bộ đệm lên để có thể chạy dòng SDT
        System.out.print("\nNhap So Dien Thoai Nhan Vien: ");
        phone = input.nextLine();
        System.out.print("\nNhap Ten Don Hang Nhan Vien Giao: ");
        donHang = input.nextLine();
        ds.add(new NhanVien(getMaNV(), getTen(),getTuoi(), getGender(), getLuong(), getPhone(), getdonHang()));
        }

      }

    }



