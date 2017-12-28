package info.btsland.news.service;

import info.btsland.news.model.BitNew;

import java.util.List;

/**
 * Created by Administrator on 2017/12/24 0024.
 */

public interface BitNewService {



    /**
     * 根据新闻id查询新闻
     * @param newsId
     * @return
     */
    BitNew newSelect(Integer newsId);

    /**
     * 根据类型查询新闻
     * @param newType
     * @return
     */

    List<BitNew> newSelect(String newType);

    /**
     * 根据id删除新闻
     * @param newId
     * @return
     */
    int newDelete(Integer newId);

    /**
     * 修改新闻
     * @param bitNew
     * @return
     */
    int newUpString(BitNew bitNew);

    /**
     * 添加新闻
     * @param newType
     * @param title
     * @param author
     * @param time
     * @param icon
     * @param content
     * @return
     */
    int insert(String newType, String title, String author, String time,String icon, String content);

    /**
     * 添加新闻
     * @param newType
     * @param title
     * @param author
     * @param time
     * @param content
     * @return
     */
    int insert(String newType, String title, String author, String time, String content);

    /**
     *
     * 添加新闻
     * @param bitNew
     * @return
     */
    int insert(BitNew bitNew);
}
