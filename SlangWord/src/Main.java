public class Main {
    public static void main(String[] args)
    {

        try {
            BufferedOutputStream out = new BufferedOutputStream(
                    new FileOutputStream("hocSinh.txt"));
            List<HocSinh> hocSinhs = new ArrayList<>();
            while (true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("--------------------MENU--------------------");
                System.out.println("1. Them hoc sinh");
                System.out.println("2. Xem danh sach hoc sinh");
                System.out.println("3. Cap nhat hoc sinh");
                System.out.println("4. Xoa hoc sinh");
                System.out.println("5. Import danh sach tu file csv");
                System.out.println("6. Export danh sach ra file csv");
                System.out.println("7. Exit");

                System.out.print("Nhap lua chon cua ban: ");
                String choose = scan.nextLine();
                if ("1".equals(choose)) {
                    HocSinh hocSinh = new HocSinh();
                    hocSinh.Nhap();
                    hocSinhs.add(hocSinh);
                    System.out.println("Add successfully");
                } else if ("2".equals(choose)) {
                    System.out.println("---Xem danh sach theo---");
                    System.out.println("1. Ma hoc sinh tang");
                    System.out.println("2. Ma hoc sinh giam");
                    System.out.println("3. Diem tang");
                    System.out.println("4. Diem giam");
                    System.out.print("Nhap lua chon cua ban: ");
                    String choose2 = scan.nextLine();
                    if ("1".equals(choose2)) {
                        hocSinhs.sort((a, b) -> a.getMaHS().compareTo(b.getMaHS()));
                        Xuat(hocSinhs);
                    } else if ("2".equals(choose2)) {
                        hocSinhs.sort((a, b) -> b.getMaHS().compareTo(a.getMaHS()));
                        Xuat(hocSinhs);
                    } else if ("3".equals(choose2)) {
                        hocSinhs.sort((a, b) -> a.getDiem() - b.getDiem());
                        Xuat(hocSinhs);
                    } else if ("4".equals(choose2)) {
                        hocSinhs.sort((a, b) -> b.getDiem() - a.getDiem());
                        Xuat(hocSinhs);
                    }
                } else if ("3".equals(choose)) {
                    System.out.println("Nhap thong tin hoc sinh ban muon cap nhat:");
                    HocSinh hocSinh = new HocSinh();
                    hocSinh.Nhap();
                    for (int i = 0; i < hocSinhs.size(); i++) {
                        if (hocSinhs.get(i).getMaHS().equals(hocSinh.getMaHS())) {
                            hocSinhs.set(i, hocSinh);
                            System.out.println("Update successfully");
                        }

                    }
                } else if ("4".equals(choose)) {
                    System.out.println("Nhap ma hoc sinh ban muon xoa:");
                    String maXoa = scan.nextLine();
                    for (int i = 0; i < hocSinhs.size(); i++) {
                        if (hocSinhs.get(i).getMaHS().equals(maXoa)) {
                            hocSinhs.remove(i);
                            System.out.println("Delete successfully");
                        }
                    }
                } else if ("5".equals(choose)) {
                    System.out.println("Nhap file ban muon import (co duoi .csv):");
                    String path = scan.nextLine();
                    hocSinhs = readFromCSV(path);
                    System.out.println("Import successfully");
                } else if ("6".equals(choose)) {
                    System.out.println("Nhap file ban muon export (co duoi .csv):");
                    String path = scan.nextLine();
                    writeToCSV(hocSinhs, path);
                    System.out.println("Export successfully");
                } else {
                    break;
                }
            }
            for (HocSinh hs :
                    hocSinhs) {
                out.write(hs.toString().getBytes(StandardCharsets.UTF_8));
                out.write("\n".toString().getBytes(StandardCharsets.UTF_8));
            }
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
