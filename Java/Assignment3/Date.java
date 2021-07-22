import java.util.Objects;

public class Date{
   int day;
   int month;
   int year;
public Date(int day, int month, int year) {	
	this.day = day;
	this.month = month;
	this.year = year;
}
public int getDay() {
	return day;
}
@Override
public int hashCode() {
	return Objects.hash(day, month);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month;
}
public void setDay(int day) {
	this.day = day;
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
}


