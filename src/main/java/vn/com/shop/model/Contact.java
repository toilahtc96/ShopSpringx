package vn.com.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "contact", uniqueConstraints = { @UniqueConstraint(columnNames = { "con_id" }) })
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "con_id", nullable = false, unique = true)
	private Integer con_id;

	@Column(name = "con_address", nullable = true, length = 200)
	private String con_address;

	@Column(name = "con_phone", nullable = true, length = 50)
	private String con_phone;

	@Column(name = "con_mail", nullable = true, length = 50)
	private String con_mail;

	@Column(name = "con_face", nullable = true, length = 200)
	private String con_face;

	@Column(name = "con_des", nullable = true, length = 500)
	private String con_des;

	public Integer getCon_id() {
		return con_id;
	}

	public void setCon_id(Integer con_id) {
		this.con_id = con_id;
	}

	public String getCon_address() {
		return con_address;
	}

	public void setCon_address(String con_address) {
		this.con_address = con_address;
	}

	public String getCon_phone() {
		return con_phone;
	}

	public void setCon_phone(String con_phone) {
		this.con_phone = con_phone;
	}

	public String getCon_mail() {
		return con_mail;
	}

	public void setCon_mail(String con_mail) {
		this.con_mail = con_mail;
	}

	public String getCon_face() {
		return con_face;
	}

	public void setCon_face(String con_face) {
		this.con_face = con_face;
	}

	public String getCon_des() {
		return con_des;
	}

	public void setCon_des(String con_des) {
		this.con_des = con_des;
	}

	public Contact(Integer con_id, String con_address, String con_phone, String con_mail, String con_face,
			String con_des) {
		super();
		this.con_id = con_id;
		this.con_address = con_address;
		this.con_phone = con_phone;
		this.con_mail = con_mail;
		this.con_face = con_face;
		this.con_des = con_des;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

}
