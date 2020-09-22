package btvn;

public class BaiTapHaiApplication {
	public static void main(String[] args) {
		String name = " le    vAn     LuYen    ";
		BaiTapHaiApplication application = new BaiTapHaiApplication();
		name = application.vietHoa(name);
		System.out.println(name);
	}

	public String loaiBoKhoangTrang(String name) {
		name = name.trim();
		name = name.replaceAll("\\s+", " ");
		return name;

	}

	private String vietHoa(String name) {
		name = loaiBoKhoangTrang(name);
		name = name.toLowerCase();
		String temp[] = name.split(" ");
		name = "";
		for (int i = 0; i < temp.length; i++) {
			name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
			if (i < temp.length - 1)
				name += " ";

		}
		return name;
	}

}
