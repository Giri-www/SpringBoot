package entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
long id ;

@Column(nullable=false)
String name;

@Column(nullable=false,unique=true)
String userName;

@Column(nullable=false)
private String password;

@Column(nullable=false)
private Collection <Role> roles;
    

}

