package com.mastertoslave.demo.modals;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "clientes")
@Data
public class ClienteModal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  private String authorName;
  private Double price;
  private String genre;
  private Integer rating;
  @CreationTimestamp
  private Date createdAt = new Date();
  @UpdateTimestamp
  private Date updatedAt = new Date();
} 
  
