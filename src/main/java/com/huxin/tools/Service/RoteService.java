package com.huxin.tools.Service;

import com.huxin.tools.dao.ToolDao;
import com.huxin.tools.entity.Tool;
import com.huxin.tools.entity.ToolWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoteService {

    @Autowired
    ToolDao toolDao;

    public ToolWithBLOBs getToolByLink(String link) {
        return toolDao.selecToolbByLink('/' + link);
    }

}
