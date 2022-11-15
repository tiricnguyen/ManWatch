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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author congh
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ChatLieuDay")
public class ChatLieuDay implements Serializable{
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID id;
    
    @Column(name = "Ma")
    private String ma;
    
    @Column(name = "Ten")
    private String ten;
    
    @Column(name = "MauSac")
    private String mauSac;
    
    @Column(name = "TrangThai")
    private int trangThai;

    @Override
    public String toString() {
        return "ChatLieuDay{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", mauSac=" + mauSac + ", trangThai=" + trangThai + '}';
    }

   
    
    
}
