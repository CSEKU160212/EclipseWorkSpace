public class Video {

	private String VideoTitle;
	private String singerN;
	private int noOfVideoSong;
	private int noOfVideoPTime;
	
	//..................constructor.................
	public Video(String videoTitle, String singerN, int noOfVideoSong, int noOfVideoPTime) {
		super();
		VideoTitle = videoTitle;
		this.singerN = singerN;
		this.noOfVideoSong = noOfVideoSong;
		this.noOfVideoPTime = noOfVideoPTime;
	}
	
	//....................getters && setters....................
	public String getVideoTitle() {
		return VideoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		VideoTitle = videoTitle;
	}
	public String getSingerN() {
		return singerN;
	}
	public void setSingerN(String singerN) {
		this.singerN = singerN;
	}
	public int getNoOfVideoSong() {
		return noOfVideoSong;
	}
	public void setNoOfVideoSong(int noOfVideoSong) {
		this.noOfVideoSong = noOfVideoSong;
	}
	public int getNoOfVideoPTime() {
		return noOfVideoPTime;
	}
	public void setNoOfVideoPTime(int noOfVideoPTime) {
		this.noOfVideoPTime = noOfVideoPTime;
	}

	//................toString method..........................
	@Override
	public String toString() {
		return "Video Title : " + getVideoTitle() + ",\nSinger Name : " + getSingerN() + ",\nTotal No of Songs : "
				+ getNoOfVideoSong() + ",\nTotal Playing Time : " + getNoOfVideoPTime() + "\n\n";
	}
	
	
	
	
	
}
