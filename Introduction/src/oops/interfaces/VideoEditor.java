package oops.interfaces;

public interface VideoEditor {
	 
	void editVideo();
	
	default void uploadVideo() {
		 System.out.println("upload");
		 }
}
