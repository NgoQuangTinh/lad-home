import java.util.*;

class Nhap{

    public int nhapInt(){

      Scanner so = new Scanner(System.in);

      int a=so.nextInt();

      return a;

    }

    public float nhapFloat(){

        Scanner fl=new Scanner(System.in);

        float b=fl.nextFloat();

        return b;

    }

    public String nhapString(){

        Scanner st=new Scanner(System.in);

        String c=st.nextLine();

        return c;

    }

}

class CanBo{

    private String hoTen, gioiTinh,diaChi;

    private int namSinh;

    public void nhapCanBo(){

        Nhap nh=new Nhap();

        System.out.print(" Nhap ho ten: ");

        hoTen=nh.nhapString();

        System.out.print(" Nhap gioi tinh: ");

        gioiTinh=nh.nhapString();

        System.out.print(" Nhap dia chi: ");

        diaChi=nh.nhapString();

        System.out.print(" Nhap nam sinh: ");

        namSinh=nh.nhapInt();

    }

    public void hienThiCB(){

        System.out.println(" Ho ten: "+hoTen);

        System.out.println(" Dia Chi: "+ diaChi);

        System.out.println(" Nam sinh "+ namSinh);

        System.out.println(" Gioi tinh: "+gioiTinh);

    }

}
  
class NhanVien extends CanBo{

    private String congViec;

    public void NhapNhanVien(){

        nhapCanBo();

        System.out.print(" Nhap cong viec:");

        Nhap nh = new Nhap();

        congViec=nh.nhapString();

    }

    public void hienThiNV(){

        hienThiCB();

        System.out.println(" Cong viec: "+congViec);

    }

}
  
class CongNhan extends CanBo{

    private String bac;

    public void nhapCongNhan(){

        nhapCanBo();

        Nhap nh=new Nhap();

        System.out.print(" Nhap bac: ");

        bac=nh.nhapString();

    }

    public void hienThiCN(){

        hienThiCB();

        System.out.println(" Bac: "+bac);

    }

}
  
class KySu extends CanBo{

    private String nganhDT;

    public void nhapKySu(){

        Nhap nh=new Nhap();

        nhapCanBo();

        System.out.print(" Nhap nganh dao tao: ");

        nganhDT=nh.nhapString();

    }

    public void hienThiKS(){

        hienThiCB();

        System.out.println(" Nganh dao tao: "+nganhDT);

    }

}
class QuanLyCB{
  
    public void nhapDSCB(){
  
    }

}

public class Quanlycanbo {
	
  
    public static void main(String[] args) {

        KySu ks=new KySu();

        ks.nhapKySu();

        ks.hienThiKS();

    }

}
