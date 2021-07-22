
public class News {
int NewsID;
String PostedByUser;
String CommentByUser;
String Comment;
public int getNewsID() {
	return NewsID;
}
public void setNewsID(int newsID) {
	NewsID = newsID;
}
public String getPostedByUser() {
	return PostedByUser;
}
public void setPostedByUser(String postedByUser) {
	PostedByUser = postedByUser;
}
public String getCommentByUser() {
	return CommentByUser;
}
public void setCommentByUser(String commentByUser) {
	CommentByUser = commentByUser;
}
public String getComment() {
	return Comment;
}
public void setComment(String comment) {
	Comment = comment;
}
public News(int newsID, String postedByUser, String commentByUser, String comment) {
	super();
	NewsID = newsID;
	PostedByUser = postedByUser;
	CommentByUser = commentByUser;
	Comment = comment;
}
@Override
public String toString() {
	return "News [NewsID=" + NewsID + ", PostedByUser=" + PostedByUser + ", CommentByUser=" + CommentByUser
			+ ", Comment=" + Comment + "]";
}


}
