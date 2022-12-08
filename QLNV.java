package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.views.DocumentView;

public class QLNV {
    static ArrayList<NhanVien> DonVi = new ArrayList<NhanVien>();

    public static void main(String[] args) {
        NhanVien Obj = new NhanVien();
        while(true)
        {
            myMenu.MenuShow();
            Scanner input = new Scanner(System.in);
            System.out.print("\nVui Long Nhap Lua Chon Cua Ban [0...7]: ");
            int chon = input.nextInt();
            if(chon == 0) break;
            switch(chon)
            {
               case 1: Obj.NhapNhanVien(DonVi); break;
               case 2: HienThi(DonVi); break;
               case 3: Obj.Add(DonVi); break;
               case 4: Edit(); break;
               case 5: Remove();  break;
               case 6: //TimKiem();
                        Scanner input2 = new Scanner (System.in);
                        input.nextLine();
                        System.out.print("\nNhap MaNV Can Tim: ");
                        String maNV=input.nextLine();
                        int p1 = TimKiem(maNV);
                        if(p1 >= 0) DonVi.get(p1).Show();
                        else System.out.println("\nKHONG TIM THAY");
                              break;
               case 7: SapXep(); break;
            }
        }// end while
    }// Đóng hàm main
//-------------------------------------------------------------------------------------------
    static void HienThi (ArrayList<NhanVien> ds)
    {   
        System.out.print("\n ----------------------------------------------------------------------------------------------------");
        System.out.print("\n |                                THONG TIN NHAN VIEN GIAO HANG                                     |");
        System.out.print("\n ----------------------------------------------------------------------------------------------------");
        System.out.printf("\n | %7s | %-30s | %5s | %5s | %10s | %10s | %10s |","MA NV","HO VA TEN","TUOI","GENDER","LUONG","PHONE","DON HANG");
        System.out.print("\n ----------------------------------------------------------------------------------------------------");
        for (NhanVien nv : DonVi) 
           System.out.printf("\n | %7s | %-30s | %5d | %6s | %10.3f | %10s | %10s |",nv.getMaNV(),nv.getTen(),nv.getTuoi(),nv.getGender(),nv.getLuong(),nv.getPhone(),nv.getdonHang());
        System.out.print("\n ----------------------------------------------------------------------------------------------------");
      
    }

//--------------------------------------------------------------------------------------------
    static void Edit()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("\nNhap Ma Can Sua: ");
        String maNV = input.nextLine();
        int p =TimKiem(maNV);
        if(p >= 0)
        {  System.out.println("Ban muon sua theo?");
            System.out.println("1.Sua ten");
            System.out.println("2.Sua tuoi");
            int chon=input.nextInt();
            switch(chon){
                case 1:System.out.print("\nNhap Ten Moi: ");
                input.nextLine();
                String ten = input.nextLine();
                DonVi.get(p).setTen(ten);
                System.out.println("\n\nDa Sua!!");break;
                case 2: System.out.println("Nhap tuoi moi:");
                int tuoi = input.nextInt();
                DonVi.get(p).setTuoi(tuoi);
                System.out.println("\n\nDa Sua!!");break;
            }
        }
        else System.out.println("KHONG TIM THAY");
    }
//--------------------------------------------------------------------------------------------
    static void Remove()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("\nNhap Ma Can Xoa: ");
        String mnv=input.nextLine();
        int p = TimKiem(mnv);
        if( p >= 0 ) {
            DonVi.remove(p).Show();
            System.out.println("\n\n Da Delete !!");
        }
        else 
            System.out.println("KHONG TIM THAY");
    }
    
//--------------------------------------------------------------------------------------------
    static int TimKiem(String maNV) // tìm sinh viên theo tuổi, trả về vị trí, -1= nếu k tìm thấy tuổi,maNV,điểm => Nạp chồng, ghi đè
   {                    
        for (NhanVien nv : DonVi)
            if(nv.getMaNV().equals(maNV))
        return DonVi.indexOf(nv);
        return -1;
   }
//--------------------------------------------------------------------------------------------
   static void SapXep() // Sắp Xếp theo tuoi 
   {
    for (int i = 0; i < DonVi.size(); i++)
    for (int j = i + 1; j < DonVi.size(); j++) {
        if (DonVi.get(i).getTuoi() > DonVi.get(j).getTuoi()) {
            NhanVien ten = DonVi.get(i);
            DonVi.set(i, DonVi.get(j));
            DonVi.set(j, ten).Show();
            System.out.println("\n\nDa sap xep!!");
        }
    }
  }
}

