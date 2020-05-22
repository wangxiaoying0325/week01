package com.wxy.beans;

public class Info {
	
	private Integer id;
	//宿舍号
	private String name;
	//晾被时间
	private String uptime;
	private Integer status;
	private Integer tid;
	private String tname;
	
	public Info() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", name=" + name + ", uptime=" + uptime + ", status=" + status + ", tid=" + tid
				+ ", tname=" + tname + "]";
	}
	
	
	

}
