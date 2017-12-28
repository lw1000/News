package info.btsland.news.service.impl;

import info.btsland.news.mapper.AdminMapper;
import info.btsland.news.model.Admin;
import info.btsland.news.model.AdminExample;
import info.btsland.news.model.BitNew;
import info.btsland.news.model.BitNewExample;
import info.btsland.news.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/12/24 0024.
 */
@Service
public class AdminServiceImpl  implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Admin adminLogin(String name, String password)  {
        Admin admin=null;
        AdminExample example=new AdminExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
        List<Admin> adminList= adminMapper.selectByExample(example);
        if (adminList!=null&&adminList.size()>0){
            admin=adminList.get(0);
            admin.setPassword("");

        }

        return admin;
    }

    /**
     * 新闻发布
     *
     * @param newType
     * @param title
     * @param author
     * @param time
     * @param content
     * @return
     */
    @Override
    public BitNew newRelease(String newType, String title, String author, Date time, String content) {
        BitNew bitNew=new BitNew();

        BitNewExample bitNewExample=new BitNewExample();


        return bitNew;
    }


}
