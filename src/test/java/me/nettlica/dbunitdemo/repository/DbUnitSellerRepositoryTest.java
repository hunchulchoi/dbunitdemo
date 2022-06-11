package me.nettlica.dbunitdemo.repository;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import me.nettlica.dbunitdemo.dto.SellerDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
@EnableSpringConfigured
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
    DbUnitTestExecutionListener.class })
class DbUnitSellerRepositoryTest {

  @Autowired
  private SellerRepository sellerRepository;


  @Test
  @DatabaseSetup("/dbunit/dataset/seller.xml")
  void findById() {

//    Seller seller1 = SellerDto.builder().name("네임1").build().toEntity();
//    Seller seller2 = SellerDto.builder().name("네임2").email("email@email.com").build().toEntity();
//
//    repository.saveAll(List.of(seller1, seller2));
//
//    assertSame("네임1", repository.findById(1L).get().getName());

    System.out.println(sellerRepository.findAll());

  }

  @Test
  void add() {

    SellerDto sellerDto = SellerDto.builder()
                            .id("ID1").build();

    assertThrows(NullPointerException.class, ()-> sellerRepository.save(sellerDto.toEntity()));

    sellerDto.setName("네임1");

    assertEquals("네임1", sellerRepository.save(sellerDto.toEntity()).getName());

    System.out.println(sellerRepository.findAll());

  }

  @Test
  void update() {
  }

  @Test
  void remove() {
  }

}