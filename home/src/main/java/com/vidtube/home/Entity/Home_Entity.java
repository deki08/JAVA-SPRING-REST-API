package com.vidtube.home.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="videodata")
public class Home_Entity {
	@Id
	@Column(name="thumbnailname")
	private String imageName;
	@Column(name="thumbnailpath")
	private String imagePath;
	@Column(name="logoname")
	private String channelLogoName;
	@Column(name="logopath")
	private String logoPath;
	@Column(name="vid")
	private String vid;
	@Column(name="videotitle")
	private String videoTitle;
	@Column(name="channelname")
	private String ChannelName;
	@Column(name="viewsofvideo")
	private String views;
	@Column(name="uploaddatetime")
	private String date;
	public Home_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Home_Entity(String imageName, String imagePath, String channelLogoName, String logoPath, String vid,
			String videoTitle, String channelName, String views, String date) {
		super();
		this.imageName = imageName;
		this.imagePath = imagePath;
		this.channelLogoName = channelLogoName;
		this.logoPath = logoPath;
		this.vid = vid;
		this.videoTitle = videoTitle;
		this.ChannelName = channelName;
		this.views = views;
		this.date = date;
	}
	
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getChannelLogoName() {
		return channelLogoName;
	}
	public void setChannelLogoName(String channelLogoName) {
		this.channelLogoName = channelLogoName;
	}
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVideoTitle() {
		return videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}
	public String getChannelName() {
		return ChannelName;
	}
	public void setChannelName(String channelName) {
		ChannelName = channelName;
	}
	public String getViews() {
		return views;
	}
	public void setViews(String views) {
		this.views = views;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
}
