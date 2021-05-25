
public class Album {

	private String albumName;
	private Picture[] pictures;
	private double size;

	public Album(String name, Picture[] pictures) {

		this.albumName = name;
		this.pictures = pictures;
		this.size = 0;
		makeSize();

	}

	public String getAlbumName() {
		return albumName;
	}

	public Picture[] getPictures() {
		return pictures;
	}

	public void setPictures(Picture[] pictures) {
		this.pictures = pictures;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	private void makeSize() {
		for (int i = 0; i < this.pictures.length; i++) {
			if (this.pictures[i] == null) {
				continue;
			}
			
				this.size += (pictures[i].getSize() / 1048576);
			
		}
		

	}

	public void delPhoto(String name) {

		for (int i = 0; i < pictures.length; i++) {
			if (pictures[i].getPictureName() == name) {

				this.size -= (pictures[i].getSize() / 1048576);
				pictures[i] = null;

			}

		}

	}

	public String getPhotosDetails() {
		String str = "";
		for (int i = 0; i < pictures.length; i++) {
			if (pictures[i] != null) {
				str += pictures[i].toString() + "\n";
			}
		}
		return str;
	}

	public String toString() {

		return "\nAlbom Name: " + this.albumName + "\n" + "The Picturs Are:\n" + getPhotosDetails() 
				+ "The Album Size Is: " + this.size + " MB";

	}

}
