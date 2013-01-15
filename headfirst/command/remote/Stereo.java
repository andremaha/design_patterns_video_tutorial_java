package headfirst.command.remote;

public class Stereo {

	CD cd;
	
	public void on() {
		System.out.println(this.getClass().getName() + " is now on");
	}
	
	public void setCD(CD cd) {
		this.cd = cd;
		System.out.println("CD with the album " + cd.getAlbum() + " was set");
	}
	
	public void setVolume(int volume) {
		System.out.println("Volume was set to " + volume);
	}
	
	public void ejectCD() {
		System.out.println("CD with the album " + cd.getAlbum() + " has been ejected");
	}
	
	public void off() {
		System.out.println(this.getClass().getName() + " is now off");
	}
}
