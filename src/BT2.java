import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDong=20;
        int soCot=20;
        int[][] mang2Chieu = new int[soDong][soCot];
        int i=10;
        int j=10;
        do {
            System.out.println("-----------MENU----------");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử của mảng nằm trên đường biên");
            System.out.println("4. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("5. Tìm giá trị min, max các phần tử trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            int nhap = scanner.nextInt();

            switch (nhap) {
                case 1:
                    do {
                        System.out.println("số dòng của mảng:");
                        soDong = scanner.nextInt();
                    } while (soDong <= 0);
                    do {
                        System.out.println("nhập số cột");
                        soCot = scanner.nextInt();
                    } while (soCot <= 0);
                    System.out.println("nhập các giá trị của một dòng :");
                     mang2Chieu = new int[soDong][soCot];
                    System.out.print("Nhập các phần tử của mảng: \n");
                    for ( i = 0; i < soDong; i++) {
                        for ( j = 0; j < soCot; j++) {
                            System.out.printf("Giá trị phần tử tại hàng %d và cột %d là: ", i + 1, j + 1);
                            mang2Chieu[i][j] = scanner.nextInt();
                        }
                    }

                    break;
                case 2:
                    System.out.println("Mảng 2 chiều là: ");
                    for ( i = 0; i < soDong; i++) {
                        for ( j = 0; j < soCot; j++) {
                            System.out.printf("%d\t", mang2Chieu[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                   for (i=0;i<soDong;i++){
                       for (j=0;j<soCot;j++){
                           int c=soDong-1;
                           int d= soCot-1;
                           if (i==0&&j==0){
                               System.out.println(mang2Chieu[i][j]);
                           }
                          else if (i==c && j==d){
                               System.out.println(mang2Chieu[i][j]);
                           }
                          else {
                              continue;
                           }

                       }
                   }
                    break;
                case 4:
                    if (soDong==soCot){
                        int tong=0;
                        for ( i = 0; i < soDong; i++) {
                            for ( j = 0; j < soCot; j++) {
                                if (i==j){
                                    tong +=mang2Chieu[i][j];
                                    System.out.println("Các giá trị ở đgường chéo chính là: "+mang2Chieu[i][j]);
                                }
                            }
                        }
                        System.out.println("tổng của đường chéo chính là "+tong);
                        int tong2=0;
                        for ( i = 0; i < soDong; i++) {
                            for ( j = 0; j < soCot; j++) {
                               int c=i+j;
                               int d=soCot-1;
                                if (c==d){
                                    tong2 +=mang2Chieu[i][j];
                                    System.out.println("Các giá trị ở đg chéo phụ là: "+mang2Chieu[i][j]);
                                }
                            }
                        }
                        System.out.println("tổng của đường chéo phụ là"+tong2);
                    }else {
                        System.out.println("Vui lòng nhập lại số dòng phải bằng số cột");
                    }

                    break;
                case 5:
                    int min = mang2Chieu[0][0];
                    for ( i = 0; i < soDong; i++) {
                        for ( j = 0; j < soCot; j++) {
                            if (mang2Chieu[i][j] < min) {
                                min = mang2Chieu[i][j];
                            }
                        }
                    }
                    System.out.println("giá trị nhỏ nhất của mảng là: " + min);

                    int max=mang2Chieu[0][0];
                    for ( i = 0; i < soDong; i++) {
                        for ( j = 0; j < soCot; j++) {
                            if (mang2Chieu[i][j]>max){
                                max=mang2Chieu[i][j];
                            }
                        }
                    }
                    System.out.println("giá trị lớn nhất của mảng là: "+max);


                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("VUI LÒNG NHẬP TRONG KHOẢNG 1-7!");
            }
        }while (true);
    }
}
