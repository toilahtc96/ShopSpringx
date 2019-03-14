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
@Table(name = "category", uniqueConstraints = { @UniqueConstraint(columnNames = { "cat_id" }) })
public class Category implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cat_id", length = 11, nullable = false, unique = true)
	private Integer catId;

	@Column(name = "cat_name", length = 50, nullable = false)
	private String catName;

	@Column(name = "cat_alias", length = 50, nullable = true)
	private String catAlias;

	@Column(name = "cat_seo_text", length = 500, nullable = true)
	private String catSeoText;

	@Column(name = "cat_picture", length = 50, nullable = true)
	private String catPicture;

	@Column(name = "cat_description", length = 50, nullable = true)
	private String catDescription;

	@Column(name = "cat_type", length = 50, nullable = true)
	private String catType;

	@Column(name = "cat_active", nullable = true)
	private Integer catActive;

	@Column(name = "cat_parent_id", nullable = true)
	private Integer catParentId;

	@Column(name = "cat_has_child", nullable = true)
	private Integer catHasChild;

	@Column(name = "cat_hot", nullable = true)
	private Integer catHot;

	@Column(name = "cat_new", nullable = true)
	private Integer catNew;

	@Column(name = "cat_root", nullable = true)
	private Integer catRoot;

	@Column(name = "cat_slug", length = 500, nullable = true)
	private String catSlug;

	@Column(name = "cat_create_at", nullable = true)
	private Date catCreateAt;

	@Column(name = "cat_update_at", nullable = true)
	private Date catUpdateAt;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Integer catId, String catName, String catAlias, String catSeoText, String catPicture,
			String catDescription, String catType, Integer catActive, Integer catParentId, Integer catHasChild,
			Integer catHot, Integer catNew, Integer catRoot, String catSlug, Date catCreateAt, Date catUpdateAt) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catAlias = catAlias;
		this.catSeoText = catSeoText;
		this.catPicture = catPicture;
		this.catDescription = catDescription;
		this.catType = catType;
		this.catActive = catActive;
		this.catParentId = catParentId;
		this.catHasChild = catHasChild;
		this.catHot = catHot;
		this.catNew = catNew;
		this.catRoot = catRoot;
		this.catSlug = catSlug;
		this.catCreateAt = catCreateAt;
		this.catUpdateAt = catUpdateAt;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", catName=" + catName + ", catAlias=" + catAlias + ", catSeoText="
				+ catSeoText + ", catPicture=" + catPicture + ", catDescription=" + catDescription + ", catType="
				+ catType + ", catActive=" + catActive + ", catParentId=" + catParentId + ", catHasChild=" + catHasChild
				+ ", catHot=" + catHot + ", catNew=" + catNew + ", catRoot=" + catRoot + ", catSlug=" + catSlug
				+ ", catCreateAt=" + catCreateAt + ", catUpdateAt=" + catUpdateAt + "]";
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatAlias() {
		return catAlias;
	}

	public void setCatAlias(String catAlias) {
		this.catAlias = catAlias;
	}

	public String getCatSeoText() {
		return catSeoText;
	}

	public void setCatSeoText(String catSeoText) {
		this.catSeoText = catSeoText;
	}

	public String getCatPicture() {
		return catPicture;
	}

	public void setCatPicture(String catPicture) {
		this.catPicture = catPicture;
	}

	public String getCatDescription() {
		return catDescription;
	}

	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}

	public String getCatType() {
		return catType;
	}

	public void setCatType(String catType) {
		this.catType = catType;
	}

	public Integer getCatActive() {
		return catActive;
	}

	public void setCatActive(Integer catActive) {
		this.catActive = catActive;
	}

	public Integer getCatParentId() {
		return catParentId;
	}

	public void setCatParentId(Integer catParentId) {
		this.catParentId = catParentId;
	}

	public Integer getCatHasChild() {
		return catHasChild;
	}

	public void setCatHasChild(Integer catHasChild) {
		this.catHasChild = catHasChild;
	}

	public Integer getCatHot() {
		return catHot;
	}

	public void setCatHot(Integer catHot) {
		this.catHot = catHot;
	}

	public Integer getCatNew() {
		return catNew;
	}

	public void setCatNew(Integer catNew) {
		this.catNew = catNew;
	}

	public Integer getCatRoot() {
		return catRoot;
	}

	public void setCatRoot(Integer catRoot) {
		this.catRoot = catRoot;
	}

	public String getCatSlug() {
		return catSlug;
	}

	public void setCatSlug(String catSlug) {
		this.catSlug = catSlug;
	}

	public Date getCatCreateAt() {
		return catCreateAt;
	}

	public void setCatCreateAt(Date catCreateAt) {
		this.catCreateAt = catCreateAt;
	}

	public Date getCatUpdateAt() {
		return catUpdateAt;
	}

	public void setCatUpdateAt(Date catUpdateAt) {
		this.catUpdateAt = catUpdateAt;
	}

	
}
