import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1=0,sayi2=0,secim,sayac=2,obeb=0,okek=0;
        do {
            sayac = 2;
            obeb = 0;
            okek = 0;
            System.out.println("1- OBEB \n 2- OKEK \n 3- ÇIKIŞ\n");
            System.out.print("Seçiminizi Giriniz  :");
            secim = giris.nextInt();
            if (secim == 1 | secim == 2){
                System.out.println("Birinci sayıyı giriniz: ");
                sayi1 = giris.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                sayi2 = giris.nextInt();
                if(sayi1>sayi2){
                    int temp=sayi2;
                    sayi2=sayi1;
                    sayi1=temp;
                }

            }

            switch (secim){
                case 1:
                    while (sayac <= sayi1) {
                        if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {
                            obeb = sayac;
                        }
                        sayac ++;
                    }
                    System.out.println(sayi1 + " OBEB "+sayi2+"  :"+obeb);
                    break;
                case 2:
                    while (sayac <= sayi1) {
                        if (sayi1 % sayac == 0 && sayi2 % sayac == 0) {
                            obeb = sayac;
                        }
                        sayac ++;
                    }
                    if (obeb > 0){
                        okek = (sayi1 * sayi2)/obeb;
                    }else{
                        okek = sayi1 * sayi2;
                    }
                    System.out.println(sayi1 + " OKEK "+sayi2+"  :"+okek);

                    break;
                case 3:
                    System.out.println("Güle Güle!");
                    break;
                }
            }while(secim != 3);







        }




    }

