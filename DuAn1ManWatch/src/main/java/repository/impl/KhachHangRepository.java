/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package repository.impl;

import domainModel.KhachHang;
import java.util.UUID;
import repository.CRUDRepository;
import viewModel.KhachHangResponse;

/**
 *
 * @author Admin
 */
public class KhachHangRepository extends CRUDRepository<UUID, KhachHang, KhachHangResponse> {

    public KhachHangRepository() {
        className = KhachHang.class.getName();
        res = "new viewModel.KhachHangResponse(a.id, a.ma, a.hoVaTen, a.ngaySinh, a.sdt, a.diaChi, a.trangThai) ";
    } 

}
