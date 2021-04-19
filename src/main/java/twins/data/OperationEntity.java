package twins.data;

import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import twins.item.ItemIdBoundary;
import twins.operations.ItemWrapper;
import twins.operations.OperationId;
import twins.operations.UserIdWrapper;
import twins.user.UserId;


@Entity
@Table(name="Operations")
public class OperationEntity {
	private String operationSpace;
	private String operationId;
	private String type;
	private String itemSpace;
	private String itemId;
	private Date createdTimestamp;
	private String userSpace;
	private String userEmail;
	private Map<String, Object> operationAttributes;

	public OperationEntity() {}

	
	
	public OperationEntity(String operationSpace, String operationId, String type, String itemSpace, String itemId,
			Date createdTimestamp, String userSpace, String userEmail, Map<String, Object> operationAttributes) {
		super();
		this.operationSpace = operationSpace;
		this.operationId = operationId;
		this.type = type;
		this.itemSpace = itemSpace;
		this.itemId = itemId;
		this.createdTimestamp = createdTimestamp;
		this.userSpace = userSpace;
		this.userEmail = userEmail;
		this.operationAttributes = operationAttributes;
	}



	public String getOperationSpace() {
		return operationSpace;
	}

	public void setOperationSpace(String operationSpace) {
		this.operationSpace = operationSpace;
	}
	@Id
	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getItemSpace() {
		return itemSpace;
	}

	public void setItemSpace(String itemSpace) {
		this.itemSpace = itemSpace;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	@Transient
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	@Transient
	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getUserSpace() {
		return userSpace;
	}

	public void setUserSpace(String userSpace) {
		this.userSpace = userSpace;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Transient
	public Map<String, Object> getOperationAttributes() {
		return operationAttributes;
	}
	@Transient
	public void setOperationAttributes(Map<String, Object> operationAttributes) {
		this.operationAttributes = operationAttributes;
	}
	
	
}
