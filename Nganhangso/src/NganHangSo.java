import java.util.Scanner;


public class NganHangSo {
    //menu 1
    static void menu1(){
        System.out.println("| NGAN HANG SO | FX16701 v1.0.0" );
        System.out.println("|--------------------------------|");
        System.out.println("1. Nhap CCCD");
        System.out.println("0. Thoat");
        System.out.println("|--------------------------------|");
        System.out.println("| Chon chuc nang: ");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        if(chon ==1){   
            chon1();
        }else if(chon == 0){
            System.out.println("Thoat chuong trinh");
        }else{
            System.out.println("Nhap sai, vui long nhap lai");
        }return;
    }
    //sau khi chon 1
    static void chon1(){
        
        double randomDouble = Math.random();
            randomDouble = randomDouble * 1000 + 1;
            int randomInt = (int) randomDouble;
       System.out.printf("nhap ma xac thuc: "+randomInt);
         Scanner sc = new Scanner(System.in);
        int maXacThuc = sc.nextInt();
        if(maXacThuc == randomInt){
            System.out.println("Xac thuc thanh cong");
            menu2();
        }else{
            System.out.println("Xac thuc that bai");
        }
        
    }
    //menu 2
    static void menu2(){
        System.out.println("Vui long nhap so CCCD:");
        Scanner sc = new Scanner(System.in);
        int CCCD = sc.nextInt();
        if(length(CCCD)==12){
            System.out.println("So CCCD hop le");
            menu3();
          
        }else{
            System.out.println("So CCCD khong hop le, vui long nhap 'no' de thoat: ");
            Scanner sc1 = new Scanner(System.in);
            String no = sc1.nextLine();
            if(no.equals("no")){
                System.out.println("Thoat chuong trinh");
            }else{
                System.out.println("Nhap sai, vui long nhap lai");
            }
        }
    }
    //menu 3
    static void menu3(){
            System.out.println("| 1. kiem tra noi sinh: ");
            System.out.println("| 2. kiem tra tuoi, gioi tinh: ");
            System.out.println("| 3. kiem tra so ngau nhien: ");
            System.out.println("| 0. Thoat");
            Scanner sc = new Scanner(System.in);
            int chon = sc.nextInt();
            if(chon == 1){
                kiemTraNoiSinh();
            switch()
            {
                    
                case "001":
                System.out.println("Ha Noi");
                break;

                case "002":
                System.out.println("Ha Giang");
                break;

                case "004":
                System.out.println("Cao Bang");
                break;

                case "006":
                System.out.println("Bac Kan");
                break;

                case "008":
                System.out.println("Tuyen Quang");
                break;
                
                case "010":
                System.out.println("Lao Cai");
                break;

                case "011":
                System.out.println("Dien Bien");
                break;

                case "012":
                System.out.println("Lai Chau");
                break;


            }
            }else if(chon == 2){
                kiemTraTuoiGioiTinh();
            }else if(chon == 3){
                kiemTraSoNgauNhien();
            }else if(chon == 0){
                System.out.println("Thoat chuong trinh");
            }else{
                System.out.println("Nhap sai, vui long nhap lai");
            }

    }

    private static void kiemTraSoNgauNhien() {
    }
    private static void kiemTraNoiSinh() {
    }
    private static void kiemTraTuoiGioiTinh() {

    }

    private static int length(int CCCD) {
        return 0;
    }
    public static void main(String[] args) {
        menu1();
        

    }
    
}