/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author congh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhachHangReponse {

    private UUID id;
    private String ma;
    private String hoVaTen;
    private Date ngaySinh;
    private String sdt;
    private String diaChi;
    private Integer trangThai;

    public Object[] toRow(int index) {
        return new Object[]{index, ma, hoVaTen, ngaySinh, sdt, diaChi, trangThai};
    }
}
