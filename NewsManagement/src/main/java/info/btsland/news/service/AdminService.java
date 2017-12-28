package info.btsland.news.service;

import info.btsland.news.model.Admin;
import info.btsland.news.model.BitNew;

import java.util.Date;

/**
 * Created by Administrator on 2017/12/24 0024.
 */

public interface AdminService {

    /**
     * 登陆方法
     * @param name
     * @param password
     * @return
     */
    Admin adminLogin(String name,String password);

    /**
     * 新闻发布
     * @param title
     * @param author
     * @param time
     * @param content
     * @return
     */
    BitNew newRelease(String newType, String title, String author, Date time, String content);



}
