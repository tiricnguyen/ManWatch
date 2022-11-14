/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package service.impl;

import domainModel.KhachHang;
import java.util.List;
import java.util.UUID;
import repository.impl.KhachHangRepository;
import service.KhachHangService;
import viewModel.KhachHangResponse;

/**
 *
 * @author Admin
 */
public class KhachHangServiceImpl implements KhachHangService {

    KhachHangRepository khRepo = new KhachHangRepository();

    @Override
    public List<KhachHangResponse> getAllResponse() {
        return khRepo.getAllResponse();
    }

    @Override
    public String insert(KhachHang kh) {
        if (kh.getMa().trim().isEmpty() || kh.getHoVaTen().trim().isEmpty()
                || kh.getNgaySinh().trim().isEmpty() || kh.getSdt().trim().isEmpty()) {
            return "Không để trống";

        }
        try {
            Long.parseLong(kh.getSdt());
        } catch (Exception e) {
            return "Nhập số điện thoại";
        }
        if (kh.getSdt().length() != 10 || !kh.getSdt().startsWith("0")) {
            return "Số điện thoại phải 10 số và bắt đầu = 0";
        }

        KhachHang khMa = khRepo.findByMa(kh.getMa());
        if (khMa != null) {
            return "Mã không được trùng";
        }
        kh = khRepo.saveOrUpdate(kh);
        if (kh != null) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }

    }

    @Override
    public String update(KhachHang kh) {
        KhachHang khId = khRepo.findById(kh.getId());
        if (khId == null) {
            return "Không tìm thấy";
        }
        if (kh.getMa().trim().isEmpty() || kh.getHoVaTen().trim().isEmpty()
                || kh.getNgaySinh().trim().isEmpty() || kh.getSdt().trim().isEmpty()) {
            return "Không để trống";

        }
        try {
            Long.parseLong(kh.getSdt());
        } catch (Exception e) {
            return "Nhập số điện thoại";
        }
        if (kh.getSdt().length() != 10 || !kh.getSdt().startsWith("0")) {
            return "Số điện thoại phải 10 số và bắt đầu = 0";
        }

        if (!kh.getMa().equals(khId.getMa())) {
            KhachHang khMa = khRepo.findByMa(kh.getMa());
            if (khMa != null) {
                return "Mã không trùng";
            } else {
                khId.setMa(kh.getMa());
            }
        }
        khId.setHoVaTen(kh.getHoVaTen());
        khId.setSdt(kh.getSdt());
        khId.setDiaChi(kh.getDiaChi());
        khId.setNgaySinh(kh.getNgaySinh());
        kh = khRepo.saveOrUpdate(khId);
        if (kh != null) {
            return "Sửa thành công";
        } else {
            return "Sửa thành công";
        }
    }

    @Override
    public String delete(UUID id) {
        KhachHang khId = khRepo.findById(id);
        if (khId == null) {
            return "Không tìm thấy";
        }
        boolean delete = khRepo.delete(khId);
        if (delete) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

}
