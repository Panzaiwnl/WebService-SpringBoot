package com.curso.bootcamp.entities;

import com.curso.bootcamp.entities.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_order")
public class Order {
    private static  final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Instant moment;

    private OrderStatus orderStatus;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

}
