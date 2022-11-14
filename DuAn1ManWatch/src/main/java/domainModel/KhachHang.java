/*                          
                            +====================+
                            |                    |
                            |     TIRICNGUYEN    |
                            |                    |
                            +====================+  
 */
package domainModel;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "KhachHang")
public class KhachHang implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "HoVaTen")
    private String hoVaTen;

    @Column(name = "NgaySinh")
    private String ngaySinh;
    @Column(name = "SDT")
    private String sdt;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "SoDiem")
    private int soDiem;

    @Column(name = "TrangThai")
    private int trangThai;
}
