package com.zakary.qingblog.mapper;

import com.zakary.qingblog.domain.FriendList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_list
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("friendId") Integer friendId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_list
     *
     * @mbg.generated
     */
    int insert(FriendList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_list
     *
     * @mbg.generated
     */
    FriendList selectByPrimaryKey(@Param("userId") Integer userId, @Param("friendId") Integer friendId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_list
     *
     * @mbg.generated
     */
    List<FriendList> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend_list
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FriendList record);
}