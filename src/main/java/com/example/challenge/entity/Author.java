package com.example.challenge.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "author",schema = "fsweb")
public class Author {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;

   @Column(name = "first_name")
    private String firstName ;

   @Column(name = "last_name")
    private String lastName ;

   @OneToMany (mappedBy = "author",cascade = CascadeType.ALL)

   private List <Book> bookList = new ArrayList<>();

}
