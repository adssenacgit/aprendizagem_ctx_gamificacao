package com.senac.api.request;

import jakarta.validation.constraints.NotNull;

public class BadgeRequest {
	
	private Long id;
	@NotNull(message = "O CAMPO DESCRIÇÃO DEVE SER PREENCHIDO!!")
	private String descricao;
	@NotNull(message = "O CAMPO IMG NECESS DEVE SER PREENCHIDO!!")
	private byte[] img;
	//@NotNull(message = "O CAMPO STATUS DEVE SER PREENCHIDO!!")
	private Boolean status;
	@NotNull(message = "O CAMPO BADGE_NIVEL_ID DEVE SER PREENCHIDO!!")
	private Long badgeNivelId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Long getBadgeNivelId() {
		return badgeNivelId;
	}
	public void setBadgeNivelId(Long badgeNivelId) {
		this.badgeNivelId = badgeNivelId;
	}
	
}
