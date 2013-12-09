/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "Document", schema = "Production")
public class Document implements java.io.Serializable {

	private static final long serialVersionUID = 2049305314;

	private java.lang.Object     DocumentNode;
	private java.lang.Short      DocumentLevel;
	private java.lang.String     Title;
	private java.lang.Integer    Owner;
	private java.lang.Boolean    FolderFlag;
	private java.lang.String     FileName;
	private java.lang.String     FileExtension;
	private java.lang.String     Revision;
	private java.lang.Integer    ChangeNumber;
	private org.jooq.types.UByte Status;
	private java.lang.String     DocumentSummary;
	private byte[]               Document;
	private java.util.UUID       rowguid;
	private java.sql.Timestamp   ModifiedDate;

	public Document() {}

	public Document(
		java.lang.Object     DocumentNode,
		java.lang.Short      DocumentLevel,
		java.lang.String     Title,
		java.lang.Integer    Owner,
		java.lang.Boolean    FolderFlag,
		java.lang.String     FileName,
		java.lang.String     FileExtension,
		java.lang.String     Revision,
		java.lang.Integer    ChangeNumber,
		org.jooq.types.UByte Status,
		java.lang.String     DocumentSummary,
		byte[]               Document,
		java.util.UUID       rowguid,
		java.sql.Timestamp   ModifiedDate
	) {
		this.DocumentNode = DocumentNode;
		this.DocumentLevel = DocumentLevel;
		this.Title = Title;
		this.Owner = Owner;
		this.FolderFlag = FolderFlag;
		this.FileName = FileName;
		this.FileExtension = FileExtension;
		this.Revision = Revision;
		this.ChangeNumber = ChangeNumber;
		this.Status = Status;
		this.DocumentSummary = DocumentSummary;
		this.Document = Document;
		this.rowguid = rowguid;
		this.ModifiedDate = ModifiedDate;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "DocumentNode", unique = true, nullable = false, length = 892)
	@javax.validation.constraints.NotNull
	public java.lang.Object getDocumentNode() {
		return this.DocumentNode;
	}

	public void setDocumentNode(java.lang.Object DocumentNode) {
		this.DocumentNode = DocumentNode;
	}

	@javax.persistence.Column(name = "DocumentLevel", precision = 5)
	public java.lang.Short getDocumentLevel() {
		return this.DocumentLevel;
	}

	public void setDocumentLevel(java.lang.Short DocumentLevel) {
		this.DocumentLevel = DocumentLevel;
	}

	@javax.persistence.Column(name = "Title", nullable = false, length = 50)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getTitle() {
		return this.Title;
	}

	public void setTitle(java.lang.String Title) {
		this.Title = Title;
	}

	@javax.persistence.Column(name = "Owner", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getOwner() {
		return this.Owner;
	}

	public void setOwner(java.lang.Integer Owner) {
		this.Owner = Owner;
	}

	@javax.persistence.Column(name = "FolderFlag", nullable = false)
	@javax.validation.constraints.NotNull
	public java.lang.Boolean getFolderFlag() {
		return this.FolderFlag;
	}

	public void setFolderFlag(java.lang.Boolean FolderFlag) {
		this.FolderFlag = FolderFlag;
	}

	@javax.persistence.Column(name = "FileName", nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getFileName() {
		return this.FileName;
	}

	public void setFileName(java.lang.String FileName) {
		this.FileName = FileName;
	}

	@javax.persistence.Column(name = "FileExtension", nullable = false, length = 8)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 8)
	public java.lang.String getFileExtension() {
		return this.FileExtension;
	}

	public void setFileExtension(java.lang.String FileExtension) {
		this.FileExtension = FileExtension;
	}

	@javax.persistence.Column(name = "Revision", nullable = false, length = 5)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 5)
	public java.lang.String getRevision() {
		return this.Revision;
	}

	public void setRevision(java.lang.String Revision) {
		this.Revision = Revision;
	}

	@javax.persistence.Column(name = "ChangeNumber", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getChangeNumber() {
		return this.ChangeNumber;
	}

	public void setChangeNumber(java.lang.Integer ChangeNumber) {
		this.ChangeNumber = ChangeNumber;
	}

	@javax.persistence.Column(name = "Status", nullable = false, precision = 3)
	@javax.validation.constraints.NotNull
	public org.jooq.types.UByte getStatus() {
		return this.Status;
	}

	public void setStatus(org.jooq.types.UByte Status) {
		this.Status = Status;
	}

	@javax.persistence.Column(name = "DocumentSummary")
	public java.lang.String getDocumentSummary() {
		return this.DocumentSummary;
	}

	public void setDocumentSummary(java.lang.String DocumentSummary) {
		this.DocumentSummary = DocumentSummary;
	}

	@javax.persistence.Column(name = "Document")
	public byte[] getDocument() {
		return this.Document;
	}

	public void setDocument(byte[] Document) {
		this.Document = Document;
	}

	@javax.persistence.Column(name = "rowguid", unique = true, nullable = false)
	@javax.validation.constraints.NotNull
	public java.util.UUID getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.util.UUID rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
