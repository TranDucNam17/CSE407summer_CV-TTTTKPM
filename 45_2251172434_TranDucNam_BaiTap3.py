class BoNho:
    def __init__(self, Loai, DungLuong):
        self.Loai = Loai
        self.DungLuong = DungLuong

class Maytinh:
    def __init__(self, ten, loai_bn, dungluong_bn):
        self.ten = ten
        self.bonho = BoNho(loai_bn, dungluong_bn)

    def HienThiThongtin(self):
        print("Ten may tinh la:", self.ten, end=". ")
        print("Bo nho may tinh la:", self.bonho.Loai, "voi dung luong", self.bonho.DungLuong)

if __name__ == "__main__":
    maytinh1 = Maytinh("Laptop ABC", "SSD", "512GB")
    maytinh1.HienThiThongtin()
