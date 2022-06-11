package me.nettlica.dbunitdemo.repository;

import me.nettlica.dbunitdemo.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
