public class YoYos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassicYoYo butterfly = new ClassicYoYo();
		butterfly.brand = "Duncan";
		butterfly.color = "green";
		butterfly.material = YoYo.Material.plastic;
		butterfly.doThrow();
		
		ClassicYoYo useless = new ClassicYoYo();
		useless.brand = "Top Metal";
		useless.color = "black";
		useless.material = YoYo.Material.alloy;
		useless.doThrow();
		
		ClassicYoYo useless2 = new ClassicYoYo();
		useless2.brand = "Top Metal";
		useless2.color = "gold";
		useless.material = YoYo.Material.alloy;
		useless.doThrow();
	}

}
