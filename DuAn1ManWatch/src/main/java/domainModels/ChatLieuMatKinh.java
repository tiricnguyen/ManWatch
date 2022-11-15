/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

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
@Table(name = "ChatLieuMatKinh")
public class ChatLieuMatKinh implements Serializable{
    
    @Id 
    @GeneratedValue
    @Column(name = "Id")
    private UUID id;
    
    @Column(name = "Ma")
    private String ma;
    
    @Column(name = "Ten")
    private String ten;
    
    @Column(name = "SizeMatKinh")
    private String sizeMatKinh;
    
    @Column(name = "DoDay")
    private String doDay;
    
    @Column(name = "TrangThai")
    private String trangThai;

    @Override
    public String toString() {
        return "ChatLieuMatKinh{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", sizeMatKinh=" + sizeMatKinh + ", doDay=" + doDay + ", trangThai=" + trangThai + '}';
    }

    
    
    
}
