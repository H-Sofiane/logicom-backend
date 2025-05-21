package fr.logicom.logicom.models;


import java.time.LocalDateTime;
import java.util.List;

import fr.logicom.enums.OrderStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
  @ManyToOne(fetch = FetchType.LAZY)
  private Customer customer;
  private LocalDateTime orderDate;
  private LocalDateTime deliveryDate;
  @Enumerated(EnumType.STRING)
  private OrderStatus staus;
  private String shippingAdress;
  @ManyToMany 
  private List<Product> products;
  
}
