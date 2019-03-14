package vn.com.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "banner", uniqueConstraints = { @UniqueConstraint(columnNames = { "ban_id" }) })
public class Banner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ban_id", nullable = false, unique = true)
	private Integer banId;
	
	@Column(name = "ban_content", nullable = true, length = 500)
	private String banContent;
	
	@Column(name = "ban_img", nullable = true, length = 50)
	private String banImg;

	public Integer getBanId() {
		return banId;
	}

	public void setBanId(Integer banId) {
		this.banId = banId;
	}

	public String getBanContent() {
		return banContent;
	}

	public void setBanContent(String banContent) {
		this.banContent = banContent;
	}

	public String getBanImg() {
		return banImg;
	}

	public void setBanImg(String banImg) {
		this.banImg = banImg;
	}

	public Banner(Integer banId, String banContent, String banImg) {
		super();
		this.banId = banId;
		this.banContent = banContent;
		this.banImg = banImg;
	}

	public Banner() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Banner [banId=" + banId + ", banContent=" + banContent + ", banImg=" + banImg + "]";
	}

}
