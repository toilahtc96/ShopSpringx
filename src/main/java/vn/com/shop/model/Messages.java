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
@Table(name = "messages", uniqueConstraints = { @UniqueConstraint(columnNames = { "mes_id" }) })
public class Messages {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mes_id", length = 11, nullable = false, unique = true)
	private Integer mesId;

	@Column(name = "mes_sender", nullable = true)
	private Integer mesSender;

	@Column(name = "mes_receiver", nullable = true)
	private Integer mesReceiver;

	@Column(name = "mes_content", length = 500, nullable = true)
	private String mesContent;

	@Column(name = "mes_created_at", nullable = true)
	private Date mesCreatedAt;

	@Column(name = "mes_updated_at", nullable = true)
	private Date mesUpdatedAt;

	public Messages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Messages(Integer mesId, Integer mesSender, Integer mesReceiver, String mesContent, Date mesCreatedAt,
			Date mesUpdatedAt) {
		super();
		this.mesId = mesId;
		this.mesSender = mesSender;
		this.mesReceiver = mesReceiver;
		this.mesContent = mesContent;
		this.mesCreatedAt = mesCreatedAt;
		this.mesUpdatedAt = mesUpdatedAt;
	}

	@Override
	public String toString() {
		return "Messages [mesId=" + mesId + ", mesSender=" + mesSender + ", mesReceiver=" + mesReceiver
				+ ", mesContent=" + mesContent + ", mesCreatedAt=" + mesCreatedAt + ", mesUpdatedAt=" + mesUpdatedAt
				+ "]";
	}

	public Integer getMesId() {
		return mesId;
	}

	public void setMesId(Integer mesId) {
		this.mesId = mesId;
	}

	public Integer getMesSender() {
		return mesSender;
	}

	public void setMesSender(Integer mesSender) {
		this.mesSender = mesSender;
	}

	public Integer getMesReceiver() {
		return mesReceiver;
	}

	public void setMesReceiver(Integer mesReceiver) {
		this.mesReceiver = mesReceiver;
	}

	public String getMesContent() {
		return mesContent;
	}

	public void setMesContent(String mesContent) {
		this.mesContent = mesContent;
	}

	public Date getMesCreatedAt() {
		return mesCreatedAt;
	}

	public void setMesCreatedAt(Date mesCreatedAt) {
		this.mesCreatedAt = mesCreatedAt;
	}

	public Date getMesUpdatedAt() {
		return mesUpdatedAt;
	}

	public void setMesUpdatedAt(Date mesUpdatedAt) {
		this.mesUpdatedAt = mesUpdatedAt;
	}
	
	
}
