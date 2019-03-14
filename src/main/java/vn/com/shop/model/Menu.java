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
@Table(name = "menu", uniqueConstraints = { @UniqueConstraint(columnNames = { "men_id" }) })
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "men_id", nullable = false, unique = true)
	private Integer menId;

	@Column(name = "men_position", nullable = true)
	private Integer menPosition;

	@Column(name = "men_name", length = 50, nullable = true)
	private String menName;

	@Column(name = "men_type", length = 50, nullable = true)
	private String menType;

	@Column(name = "men_link", length = 50, nullable = true)
	private String menLink;

	@Column(name = "men_parent", nullable = true)
	private Integer menParent;

	@Column(name = "men_order", nullable = true)
	private Integer menOrder;

	@Column(name = "men_active", nullable = true)
	private Integer menActive;

	@Column(name = "men_create_time", nullable = true)
	private Date menCreateTime;

	@Column(name = "men_upadte_time", nullable = true)
	private Date menUpadteTime;

	@Column(name = "men_root", nullable = true)
	private Integer men_root;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(Integer menId, Integer menPosition, String menName, String menType, String menLink, Integer menParent,
			Integer menOrder, Integer menActive, Date menCreateTime, Date menUpadteTime, Integer men_root) {
		super();
		this.menId = menId;
		this.menPosition = menPosition;
		this.menName = menName;
		this.menType = menType;
		this.menLink = menLink;
		this.menParent = menParent;
		this.menOrder = menOrder;
		this.menActive = menActive;
		this.menCreateTime = menCreateTime;
		this.menUpadteTime = menUpadteTime;
		this.men_root = men_root;
	}

	@Override
	public String toString() {
		return "Menu [menId=" + menId + ", menPosition=" + menPosition + ", menName=" + menName + ", menType=" + menType
				+ ", menLink=" + menLink + ", menParent=" + menParent + ", menOrder=" + menOrder + ", menActive="
				+ menActive + ", menCreateTime=" + menCreateTime + ", menUpadteTime=" + menUpadteTime + ", men_root="
				+ men_root + "]";
	}

	public Integer getMenId() {
		return menId;
	}

	public void setMenId(Integer menId) {
		this.menId = menId;
	}

	public Integer getMenPosition() {
		return menPosition;
	}

	public void setMenPosition(Integer menPosition) {
		this.menPosition = menPosition;
	}

	public String getMenName() {
		return menName;
	}

	public void setMenName(String menName) {
		this.menName = menName;
	}

	public String getMenType() {
		return menType;
	}

	public void setMenType(String menType) {
		this.menType = menType;
	}

	public String getMenLink() {
		return menLink;
	}

	public void setMenLink(String menLink) {
		this.menLink = menLink;
	}

	public Integer getMenParent() {
		return menParent;
	}

	public void setMenParent(Integer menParent) {
		this.menParent = menParent;
	}

	public Integer getMenOrder() {
		return menOrder;
	}

	public void setMenOrder(Integer menOrder) {
		this.menOrder = menOrder;
	}

	public Integer getMenActive() {
		return menActive;
	}

	public void setMenActive(Integer menActive) {
		this.menActive = menActive;
	}

	public Date getMenCreateTime() {
		return menCreateTime;
	}

	public void setMenCreateTime(Date menCreateTime) {
		this.menCreateTime = menCreateTime;
	}

	public Date getMenUpadteTime() {
		return menUpadteTime;
	}

	public void setMenUpadteTime(Date menUpadteTime) {
		this.menUpadteTime = menUpadteTime;
	}

	public Integer getMen_root() {
		return men_root;
	}

	public void setMen_root(Integer men_root) {
		this.men_root = men_root;
	}
	
	
}
