package info.btsland.news.service.impl;

import info.btsland.news.mapper.BitNewMapper;
import info.btsland.news.model.BitNew;
import info.btsland.news.model.BitNewExample;
import info.btsland.news.service.BitNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/24 0024.
 */
@Service
public class BitNewServiceImpl implements BitNewService {


    @Autowired
    private BitNewMapper bitNewMapper;




    /**
     * 根据新闻id查询新闻
     *
     * @param newsId
     * @return
     */
    @Override
    public BitNew newSelect(Integer newsId) {
        return null;
    }

    /**
     * 根据类型查询新闻
     *
     * @param newType
     * @return
     */
    @Override
    public List<BitNew> newSelect(String newType) {
        BitNew bitNew=new BitNew();
        BitNewExample  bitNewexample=new BitNewExample();
        bitNewexample.createCriteria().andNewTypeEqualTo(newType);
        List<BitNew> bitNewList= bitNewMapper.selectByExample(bitNewexample);
        List<BitNew> list=null;
        if(bitNewList!=null&&bitNewList.size()>0){
            list=new ArrayList<>();
            if(bitNewList.size()>10){
                for (int i=bitNewList.size()-10;i<bitNewList.size();i++){
                    list.add(bitNewList.get(i));
                }
            }else {
                for (int i=0;i<bitNewList.size();i++){
                    System.out.println(bitNewList.get(i));
                    list.add(bitNewList.get(i));
                }
            }
        }
        return list;
    }

    /**
     * 根据id删除新闻
     *
     * @param newId
     * @return
     */
    @Override
    public int newDelete(Integer newId) {
        return 0;
    }

    /**
     * 修改新闻
     *
     * @param bitNew
     * @return
     */
    @Override
    public int newUpString(BitNew bitNew) {

        return bitNewMapper.updateByPrimaryKeySelective(bitNew);
    }


    /**
     *  添加新闻
     * @param newType
     * @param title
     * @param author
     * @param time
     * @param icon
     * @param content
     * @return
     */
    @Override
    public int insert(String newType, String title, String author,String time,String icon, String content) {
        BitNew bitNew=new BitNew(newType,title,author,time,icon,content);


        return bitNewMapper.insert(bitNew);
    }

    /**
     *
     * @param newType
     * @param title
     * @param author
     * @param time
     * @param content
     * @return
     */
    @Override
    public int insert(String newType, String title, String author, String time, String content) {
        BitNew bitNew=new BitNew(newType,title,author,time,content);


        return bitNewMapper.insert(bitNew);
    }

    /**
     * 添加新闻
     *
     * @param bitNew
     * @return
     */
    @Override
    public int insert(BitNew bitNew) {

        return bitNewMapper.insert(bitNew);
    }


}
