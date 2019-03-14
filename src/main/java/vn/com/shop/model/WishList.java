package vn.com.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "wish_list" , uniqueConstraints = { @UniqueConstraint(columnNames = { "wis_id" }) })
public class WishList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wis_id" , nullable = false, unique = true)
	private Integer wis_id;
	
	@Column(name = "wis_user_id" , nullable = true, unique = true)
	private Integer wis_user_id;
	
	@Column(name = "wis_list" , nullable = true, length = 500)
	private String wis_list;

	public Integer getWis_id() {
		return wis_id;
	}

	public void setWis_id(Integer wis_id) {
		this.wis_id = wis_id;
	}

	public Integer getWis_user_id() {
		return wis_user_id;
	}

	public void setWis_user_id(Integer wis_user_id) {
		this.wis_user_id = wis_user_id;
	}

	public String getWis_list() {
		return wis_list;
	}

	public void setWis_list(String wis_list) {
		this.wis_list = wis_list;
	}

	public WishList(Integer wis_id, Integer wis_user_id, String wis_list) {
		super();
		this.wis_id = wis_id;
		this.wis_user_id = wis_user_id;
		this.wis_list = wis_list;
	}

	public WishList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
