package vn.com.shop.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "product", uniqueConstraints = { @UniqueConstraint(columnNames = { "pro_id" }) })
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pro_id", length = 11, nullable = false, unique = true)
	private Integer proId;

	@Column(name = "pro_name", length = 50, nullable = false)
	private String proName;

	@Column(name = "pro_category_id", nullable = true)
	private Integer proCategoryId;

	@Column(name = "pro_price", nullable = true)
	private Float proPrice;

	@Column(name = "pro_img", length = 50, nullable = true)
	private String proImg;

	@Column(name = "pro_list_img", length = 500, nullable = true)
	private String proListImg;

	@Column(name = "pro_create_time", nullable = true)
	private Date proCreateTime;

	@Column(name = "pro_upadte_time", nullable = true)
	private Date proUpadteTime;

	@Column(name = "pro_active", nullable = true)
	private Integer proActive;

	@Column(name = "pro_description", length = 50, nullable = true)
	private String proDescription;

	@Column(name = "pro_guarantee", length = 20, nullable = true)
	private String proGuarantee;
	
	@Column(name = "pro_color", length = 50, nullable = true)
	private String proColor;
	
	@Column(name = "pro_brand", nullable = true)
	private Integer proBrand;
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer proId, String proName, Integer proCategoryId, Float proPrice, String proImg,
			String proListImg, Date proCreateTime, Date proUpadteTime, Integer proActive, String proDescription,
			String proGuarantee) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proCategoryId = proCategoryId;
		this.proPrice = proPrice;
		this.proImg = proImg;
		this.proListImg = proListImg;
		this.proCreateTime = proCreateTime;
		this.proUpadteTime = proUpadteTime;
		this.proActive = proActive;
		this.proDescription = proDescription;
		this.proGuarantee = proGuarantee;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proCategoryId=" + proCategoryId + ", proPrice="
				+ proPrice + ", proImg=" + proImg + ", proListImg=" + proListImg + ", proCreateTime=" + proCreateTime
				+ ", proUpadteTime=" + proUpadteTime + ", proActive=" + proActive + ", proDescription=" + proDescription
				+ ", proGuarantee=" + proGuarantee + "]";
	}

	public Integer getProId() {
		return proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Integer getProCategoryId() {
		return proCategoryId;
	}

	public void setProCategoryId(Integer proCategoryId) {
		this.proCategoryId = proCategoryId;
	}

	public Float getProPrice() {
		return proPrice;
	}

	public void setProPrice(Float proPrice) {
		this.proPrice = proPrice;
	}

	public String getProImg() {
		return proImg;
	}

	public void setProImg(String proImg) {
		this.proImg = proImg;
	}

	public String getProListImg() {
		return proListImg;
	}

	public void setProListImg(String proListImg) {
		this.proListImg = proListImg;
	}

	public Date getProCreateTime() {
		return proCreateTime;
	}

	public void setProCreateTime(Date proCreateTime) {
		this.proCreateTime = proCreateTime;
	}

	public Date getProUpadteTime() {
		return proUpadteTime;
	}

	public void setProUpadteTime(Date proUpadteTime) {
		this.proUpadteTime = proUpadteTime;
	}

	public Integer getProActive() {
		return proActive;
	}

	public void setProActive(Integer proActive) {
		this.proActive = proActive;
	}

	public String getProDescription() {
		return proDescription;
	}

	public void setProDescription(String proDescription) {
		this.proDescription = proDescription;
	}

	public String getProGuarantee() {
		return proGuarantee;
	}

	public void setProGuarantee(String proGuarantee) {
		this.proGuarantee = proGuarantee;
	}

	public String getProColor() {
		return proColor;
	}

	public void setProColor(String proColor) {
		this.proColor = proColor;
	}

	public Integer getProBrand() {
		return proBrand;
	}

	public void setProBrand(Integer proBrand) {
		this.proBrand = proBrand;
	}
	
}
