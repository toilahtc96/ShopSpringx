package vn.com.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "brand", uniqueConstraints = { @UniqueConstraint(columnNames = { "bra_id" }) })
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bra_id", nullable = false, unique = true)
	private Integer bra_id;
	
	@Column(name = "bra_name", nullable = true, length = 50)
	private String bra_name;
	
	@Column(name = "bra_res", nullable = true, length = 50)
	private String bra_res;
	
	@Column(name = "bra_des", nullable = true, length = 50)
	private String bra_des;

	public Integer getBra_id() {
		return bra_id;
	}

	public void setBra_id(Integer bra_id) {
		this.bra_id = bra_id;
	}

	public String getBra_name() {
		return bra_name;
	}

	public void setBra_name(String bra_name) {
		this.bra_name = bra_name;
	}

	public String getBra_res() {
		return bra_res;
	}

	public void setBra_res(String bra_res) {
		this.bra_res = bra_res;
	}

	public String getBra_des() {
		return bra_des;
	}

	public void setBra_des(String bra_des) {
		this.bra_des = bra_des;
	}

	public Brand(Integer bra_id, String bra_name, String bra_res, String bra_des) {
		super();
		this.bra_id = bra_id;
		this.bra_name = bra_name;
		this.bra_res = bra_res;
		this.bra_des = bra_des;
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
