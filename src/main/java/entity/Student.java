package entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
long id ;

@Column(nullable=false)
String name;

@Column(nullable=false,unique=true)
String userName;

@Column(nullable=false)
private String password;

 @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
     name="roles",
     joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
     inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
private Collection <Role> roles = new ArrayList<>();
    

}

