package com.estsoft.ticketing.vo;

public class TicketingVo {
	private Long no;
	private String phone;
	private Integer count;
	private Long movieNo;
	private String movieTitle;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Long getMovieNo() {
		return movieNo;
	}
	public void setMovieNo(Long movieNo) {
		this.movieNo = movieNo;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	@Override
	public String toString() {
		return "TicketingVo [no=" + no + ", phone=" + phone + ", count=" + count + ", movieNo=" + movieNo
				+ ", movieTitle=" + movieTitle + "]";
	}
}
