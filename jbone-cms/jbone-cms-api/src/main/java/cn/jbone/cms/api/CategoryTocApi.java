package cn.jbone.cms.api;

import cn.jbone.cms.common.dataobject.*;
import cn.jbone.common.rpc.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/categoryToc")
public interface CategoryTocApi {

    @RequestMapping(value = "/addOrUpdate",method = {RequestMethod.POST})
    Result<Void> addOrUpdate(@RequestBody CategoryTocDO categoryTocDO);

    @RequestMapping(value = "/delete",method = {RequestMethod.DELETE})
    Result<Void> delete(@RequestParam("id") Long id);

    @RequestMapping(value = "/getTree",method = {RequestMethod.GET,RequestMethod.POST})
    Result<CategoryTocDO> getTree(@RequestParam("categoryId") Long categoryId);


}
