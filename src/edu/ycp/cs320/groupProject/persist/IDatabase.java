package edu.ycp.cs320.groupProject.persist;

import java.util.List;

import edu.ycp.cs320.groupProject.model.Chatroom;
import edu.ycp.cs320.groupProject.model.Post;
import edu.ycp.cs320.groupProject.model.User;

public interface IDatabase {

//done
	public Boolean signUp(User u);
//done
	public boolean Login(User u);
	
	//josh	
	public Boolean deleteUser(User u);
	//josh
	public Boolean deleteChatroom(Chatroom c);
	//josh
	public Boolean createChatroom(Chatroom c, User u);
	//josh
	public List<Post> selectMessages(Chatroom c);
	//rathana
	public Boolean removeUserFromChatroom(Chatroom c, User u);
	//rathana
	public User selectAdminFromChatroom(Chatroom c);
	//rathana
	public Boolean changeAdmin(Chatroom c, User u);
	//brad
	public Boolean insertMessages(Chatroom c, Post p);
	//brad
	public List<Chatroom> selectAllChatrooms();
	//brad
	public Boolean insertUserIntoChatroom(User u, Chatroom c);
	
	
	
	
	
	
	

	
	
}
