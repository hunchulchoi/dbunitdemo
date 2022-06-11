package me.nettlica.dbunitdemo.repository;

import me.nettlica.dbunitdemo.dto.SellerDto;
import me.nettlica.dbunitdemo.entity.Seller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


@SpringBootTest
@EnableSpringConfigured
class SellerRepositoryTest {

  @Autowired
  private SellerRepository sellerRepository;

  @Test
  void findById() {

    Seller seller1 = SellerDto.builder().name("네임1").build().toEntity();
    Seller seller2 = SellerDto.builder().name("네임2").email("email@email.com").build().toEntity();

    sellerRepository.saveAll(List.of(seller1, seller2));

    assertEquals("네임1", sellerRepository.findById(1L).get().getName());

    System.out.println(sellerRepository.findAll());

  }

  @Test
  void add() {
  }

  @Test
  void update() {
  }

  @Test
  void remove() {
  }

}