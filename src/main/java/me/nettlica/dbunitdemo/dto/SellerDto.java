package me.nettlica.dbunitdemo.dto;

import lombok.Builder;
import lombok.Data;
import me.nettlica.dbunitdemo.entity.Seller;

@Builder
@Data
public class SellerDto {

  private String id;
  private String name;
  private String email;

  public Seller toEntity() {
    return new Seller(id, name, email);
  }
}
