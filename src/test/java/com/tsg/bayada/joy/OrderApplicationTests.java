package com.tsg.bayada.joy;

import org.springframework.boot.test.context.SpringBootTest;

//
//package com.tsg.ust.bayada;
//
//import com.tsg.ust.bayada.adapter.*;
//import com.tsg.ust.bayada.domain.UserRepository;
//import com.tsg.ust.bayada.domain.UserService;
//import com.tsg.ust.bayada.domain.Users;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.*;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import java.time.Instant;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
@SpringBootTest
class OrderApplicationTests {
//
//  @InjectMocks
//  private UserService orderService;
//  @Mock
//  private UserRepository orderRepository;
//  @Mock
//  private UserJpaRepository orderJpaRepository;
//  @Mock
//  private UserMapper orderMapper;
//  @Mock
//  private UserRepositoryImpl orderRepositoryImpl;
//  Instant datetime = Instant.parse("2023-04-11T10:30:00Z");
//  List<Items> items= Collections.singletonList(new Items(1, "fry", "10", "2"));
//  //  List<ItemEntity> itemEntity= (List<ItemEntity>) new ItemEntity(1, "fry", "10", "2");
//  ItemEntity itemEntity=new ItemEntity(1, "fry", "10", "2");
//  Users orders= new Users(1L,"aaa",datetime,"33","4","4","baking", Collections.singletonList(itemEntity));
//  //  OrderEntity orderEntity=new OrderEntity(1L,"aaa",datetime,"33","4","six",items);
//  @Test
//  public void testGetOrder() {
//    when(orderRepository.findById(1L)).thenReturn(orders);
//    assertEquals(orders,orderService.findOrderById(1L));
//
//  }
//  //  @Test
////  public void testGetOrder() throws Exception {
//////    doNothing().when(orderRepository.findById(orders.id()));
////    when(orderRepository.findById(orders.id())).thenReturn(orders);
////    when(orderJpaRepository.findById(orders.id())).thenReturn(Optional.ofNullable(orderEntity));
////    when(orderRepositoryImpl.findById(orders.id())).thenReturn(orders);
////    when(orderMapper.toEntity(orders)).thenReturn(orderEntity);
////    assertEquals(orders,orderService.findOrderById(1L));
////
////  }
//  @Test
//  public void testDeleteOrder(){
////    doNothing().doThrow(new RuntimeException()).when(orderService).deleteById(orders.id());
//    when(orderRepository.findById(orders.id())).thenReturn(orders);
//    when(orderRepository.deleteById(orders.id())).thenReturn(orders);
//    assertEquals(orders,orderService.deleteById(orders.id()));
//
//
//
//  }
//  @Test
//  public void testUpdateOrder() {
//    Users orders1= new Users(1L,"aaa",datetime,"33","4","4","frying", Collections.singletonList(itemEntity));
//    when(orderRepository.findById(orders1.id())).thenReturn(orders);
//    when(orderRepository.save(orders1)).thenReturn(orders1);
//    ResponseEntity<String> response = orderService.update(orders1);
//    assertEquals(HttpStatus.OK, response.getStatusCode());
//    assertEquals("updated successfully", response.getBody());
//  }
//  @Test
//  public void testAddOrder(){
//    when(orderRepository.save(orders)).thenReturn(orders);
//    Users orders1=orderService.save(orders);
//    assertEquals(orders,orders1);
//  }
//
//  @Test
//  public void testFindAll() {
//    // Create a list of Orders objects for testing
//    List<Users> ordersList = Arrays.asList(
//      new Users(1L, "aaa", Instant.now(), "3", "33", "4", "six", Collections.singletonList(itemEntity)),
//      new Users(2L, "bbb", Instant.now(), "4", "44", "5", "seven", Collections.singletonList(itemEntity)),
//      new Users(3L, "ccc", Instant.now(), "5", "55", "6", "eight", Collections.singletonList(itemEntity))
//    );
//    int page = 1;
//    // Mock the behavior of orderRepository.findAll() method
//    when(orderRepository.findAll(page)).thenReturn(new PageImpl<>(ordersList));
//
//    // Call the getAllOrders() method of the orderService
//    Page<Users> result = orderService.getAllOrders(page);
//
//    // Assert the expected results
//    assertNotNull(result);
//    assertEquals(ordersList.size(), result.getContent().size());
//    // Add additional assertions as needed
//
//  }
//
}
