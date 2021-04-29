zpublic class Main {
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
                    System.out.println("---Xem danh sach theo---");
                    System.out.println("1. Ma hoc sinh tang");
                    System.out.println("2. Ma hoc sinh giam");
                    System.out.println("3. Diem tang");
                    System.out.println("4. Diem giam");
                    System.out.print("Nhap lua chon cua ban: ");
                    String choose2 = scan.nextLine();
                    if ("1".equals(choose2)) {
                        hocSinhs.sort((a, b) -> a.getMaHS().comp
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
                        hocSinhs.sort((a, b) -> b.getDiem() - a.getDiem());
                        Xuat(hocSinhs);
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                        Xuat(hocSinhs);areTo(b.getMaHS()));
                        Xuat(hocSinhs);
                    } else if ("2".equals(choose2)) {
                        hocSinhs.sort((a, b) -> b.getMaHS().compareTo(a.getMaHS()));
                        Xuat(hocSinhs);
                    } else if ("3".equals(choose2)) {
                        hocSinhs.sort((a, b) -> a.getDiem() - b.getDiem());
                        Xuat(hocSinhs);
                    } else if ("4".equals(choose2)) {
                    } else if ("3".equals(choose2)) {
                        hocSinhs.sort((a, b) -> a.getDiem() - b.getDiem());
                        Xuat(hocSinhs);
                    } else if ("4".equals(choose2)) {
                        hocSinhs.sort((a, b) -> b.getDiem() - a.getDiem());
                        Xuat(hocSinhs);areTo(b.getMaHS()));
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
                    System.out.println("---Xem danh sach theo---");
                    System.out.println("1. Ma hoc sinh tang");
                    System.out.println("2. Ma hoc sinh giam");
                    System.out.println("3. Diem tang");
                    System.out.println("4. Diem giam");
                    System.out.print("Nhap lua chon cua ban: ");
                    String choose2 = scan.nextLine();
                    if ("1".equals(choose2)) {
                        hocSinhs.sort((a, b) -> a.getMaHS().comp
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
                        Xuat(hocSinhs);
