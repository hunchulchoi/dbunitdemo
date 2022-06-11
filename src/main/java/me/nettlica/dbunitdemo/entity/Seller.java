package me.nettlica.dbunitdemo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Seller {

  @Id
  private String id;
  @NonNull
  private String name;
  private String email;
}
