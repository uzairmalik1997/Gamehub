package it.unipi.lsmsd.gamehub.service;

import it.unipi.lsmsd.gamehub.DTO.ReviewDTO;
import it.unipi.lsmsd.gamehub.model.GameNeo4j;
import it.unipi.lsmsd.gamehub.model.Review;
import it.unipi.lsmsd.gamehub.model.UserNeo4j;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserNeo4jService {
    public void SyncUser();
    public void loadGames();


    //DA MODIFICARE NEL MAIN->TROVA LA LISTA DI GIOCHI DEGLI AMICI
    public List<GameNeo4j> getUserWishlist(String username,String friendUsername);

    public Boolean addGameToWishlist(String username,String name);

    public Boolean deleteGameToWishlist(String username,String name);

    List<UserNeo4j> getFollowedUser(String username);

    List<UserNeo4j> getFriendsOfFriends(String username);

    List<UserNeo4j> getSuggestedFriends(String username);

    public Boolean addLikeToReview(String username,String id);

    public long countUserDocument();



    Boolean followUser(String followerUsername, String followedUsername);
    Boolean unfollowUser(String followerUsername, String followedUsername);
    public ResponseEntity<String> addUser(String id, String username);
    public UserNeo4j getUser(String username);
    ResponseEntity<String > updateUser(String username, String newUsername);


}