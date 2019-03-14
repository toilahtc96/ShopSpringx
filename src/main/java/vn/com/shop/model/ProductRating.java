package vn.com.shop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "product_rating", uniqueConstraints = { @UniqueConstraint(columnNames = { "pra_id" }) })
public class ProductRating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pra_id", length = 11, nullable = false, unique = true)
	private Integer praId;

	@Column(name = "pra_product_id", nullable = true)
	private Integer praProductId;

	@Column(name = "pra_avg", nullable = true)
	private Float praAvg;

	@Column(name = "pra_count_rate", nullable = true)
	private Integer praCountRate;

	@Column(name = "pra_total_point", nullable = true)
	private Float pratotalPoint;

	@Column(name = "pra_count_star", nullable = true)
	private Integer praCountStar;

	@Column(name = "pra_created_at", nullable = true)
	private Date praCreatedAt;

	@Column(name = "pra_updated_at", nullable = true)
	private Date praUpdatedAt;

	public ProductRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductRating(Integer praId, Integer praProductId, Float praAvg, Integer praCountRate, Float pratotalPoint,
			Integer praCountStar, Date praCreatedAt, Date praUpdatedAt) {
		super();
		this.praId = praId;
		this.praProductId = praProductId;
		this.praAvg = praAvg;
		this.praCountRate = praCountRate;
		this.pratotalPoint = pratotalPoint;
		this.praCountStar = praCountStar;
		this.praCreatedAt = praCreatedAt;
		this.praUpdatedAt = praUpdatedAt;
	}

	@Override
	public String toString() {
		return "ProductRating [praId=" + praId + ", praProductId=" + praProductId + ", praAvg=" + praAvg
				+ ", praCountRate=" + praCountRate + ", pratotalPoint=" + pratotalPoint + ", praCountStar="
				+ praCountStar + ", praCreatedAt=" + praCreatedAt + ", praUpdatedAt=" + praUpdatedAt + "]";
	}

	public Integer getPraId() {
		return praId;
	}

	public void setPraId(Integer praId) {
		this.praId = praId;
	}

	public Integer getPraProductId() {
		return praProductId;
	}

	public void setPraProductId(Integer praProductId) {
		this.praProductId = praProductId;
	}

	public Float getPraAvg() {
		return praAvg;
	}

	public void setPraAvg(Float praAvg) {
		this.praAvg = praAvg;
	}

	public Integer getPraCountRate() {
		return praCountRate;
	}

	public void setPraCountRate(Integer praCountRate) {
		this.praCountRate = praCountRate;
	}

	public Float getPratotalPoint() {
		return pratotalPoint;
	}

	public void setPratotalPoint(Float pratotalPoint) {
		this.pratotalPoint = pratotalPoint;
	}

	public Integer getPraCountStar() {
		return praCountStar;
	}

	public void setPraCountStar(Integer praCountStar) {
		this.praCountStar = praCountStar;
	}

	public Date getPraCreatedAt() {
		return praCreatedAt;
	}

	public void setPraCreatedAt(Date praCreatedAt) {
		this.praCreatedAt = praCreatedAt;
	}

	public Date getPraUpdatedAt() {
		return praUpdatedAt;
	}

	public void setPraUpdatedAt(Date praUpdatedAt) {
		this.praUpdatedAt = praUpdatedAt;
	}

}
