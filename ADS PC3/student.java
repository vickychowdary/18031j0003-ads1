import java.io.*;

public class student implements Serializable
{
	private int date;
	private int month;
	private int year;
	private int s1;
	private int s2;
	private int s3;
	private int total;
	@Override
	public String toString() {
		return "," + date + "-" + month + "-" + year + "," + s1
				+ "," + s2 + "," + s3 + "," + total ;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getS1() {
		return s1;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public int getS2() {
		return s2;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	public int getS3() {
		return s3;
	}
	public void setS3(int s3) {
		this.s3 = s3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
