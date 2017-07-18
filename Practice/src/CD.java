public class CD 
{
	private String CDTitle;
	private String singerName;
	private int noOfCDSong;
	private int noOfCDPTime;
	
	//..................constructor.................
	public CD(String cDTitle, String singerName, int noOfCDSong, int noOfCDPTime) {
		super();
		CDTitle = cDTitle;
		this.singerName = singerName;
		this.noOfCDSong = noOfCDSong;
		this.noOfCDPTime = noOfCDPTime;
	}
	
	//....................getters && setters....................
	public String getCDTitle() {
		return CDTitle;
	}
	public void setCDTitle(String cDTitle) {
		CDTitle = cDTitle;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public int getNoOfCDSong() {
		return noOfCDSong;
	}
	public void setNoOfCDSong(int noOfCDSong) {
		this.noOfCDSong = noOfCDSong;
	}
	public int getNoOfCDPTime() {
		return noOfCDPTime;
	}
	public void setNoOfCDPTime(int noOfCDPTime) {
		this.noOfCDPTime = noOfCDPTime;
	}

	//---------------------toString method---------------------------
	@Override
	public String toString() {
		return "CD Title : " + getCDTitle() + ",\nSinger Name : " + getSingerName() + ",\nNo Of Songs : "
				+ getNoOfCDSong() + ", \nTotal Playing Time : " + getNoOfCDPTime() + "\n\n";
	}
	
	
	
}
