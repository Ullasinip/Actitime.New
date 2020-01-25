package javabeanclass;

import ObjectMethods.Mobile;

public class Mobile implements Comparable
{
	private String name;
	private int rom;
	private int ram;
	private String os;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public int compareTo(Object o) {
		Mobile m = (Mobile) o;
		return this.name.compareTo(m.name);
	}
	
	public int compare(Mobile o1,Mobile o2)
	{
		return (int)(o2.ram-o1.ram);
	}
	
	
}
 