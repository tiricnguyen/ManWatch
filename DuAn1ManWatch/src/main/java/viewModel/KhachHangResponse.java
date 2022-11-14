/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package viewModel;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class KhachHangResponse {

    private UUID id;
    private String ma;
    private String hoVaTen;
    private String ngaySinh;
    private String sdt;
    private String diaChi;
    private int trangThai;

    public Object[] toDataRow(int index) {
        return new Object[]{index, ma, hoVaTen, ngaySinh, sdt, diaChi, trangThai};
    }

}
