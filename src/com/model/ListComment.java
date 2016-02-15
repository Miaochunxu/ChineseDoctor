package com.model;

public class ListComment {

	private int imgSrc;
	private String commet;

	public ListComment(int imgSrc, String commet) {
		super();
		this.imgSrc = imgSrc;
		this.commet = commet;
	}

	public int getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(int imgSrc) {
		this.imgSrc = imgSrc;
	}

	public String getCommet() {
		return commet;
	}

	public void setCommet(String commet) {
		this.commet = commet;
	}
}
