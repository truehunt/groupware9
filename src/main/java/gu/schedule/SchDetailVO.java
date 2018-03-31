package gu.schedule;

public class SchDetailVO {

    private String  ssno,	 	//일정번호
				    sddate,		 //날짜
				    sdhour,		 //시간
				    sdminute,	 //분
				    sstitle				// 일정명
    ;
    private Integer sdseq;		 //순번

	public String getSsno() {
		return ssno;
	}

	public Integer getSdseq() {
		return sdseq;
	}

	public String getSddate() {
		return sddate;
	}
 
	public String getSdminute() {
		return sdminute;
	}

	public void setSdminute(String sdminute) {
		this.sdminute = sdminute;
	}

	public String getSdhour() {
		return sdhour;
	}

	public void setSsno(String ssno) {
		this.ssno = ssno;
	}

	public void setSdseq(Integer sdseq) {
		this.sdseq = sdseq;
	}

	public void setSddate(String sddate) {
		this.sddate = sddate;
	}

	public String getSstitle() {
		return sstitle;
	}

	public void setSstitle(String sstitle) {
		this.sstitle = sstitle;
	}

	public void setSdhour(String sdhour) {
		this.sdhour = sdhour;
	}

}
