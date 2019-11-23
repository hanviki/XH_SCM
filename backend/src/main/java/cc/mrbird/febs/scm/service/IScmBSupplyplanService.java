package cc.mrbird.febs.scm.service;

import cc.mrbird.febs.scm.entity.ScmBSupplyplan;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import cc.mrbird.febs.common.domain.QueryRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 供应计划 服务类
 * </p>
 *
 * @author viki
 * @since 2019-11-21
 */
public interface IScmBSupplyplanService extends IService<ScmBSupplyplan> {

        IPage<ScmBSupplyplan> findScmBSupplyplans(QueryRequest request, ScmBSupplyplan scmBSupplyplan);

        void createScmBSupplyplan(ScmBSupplyplan scmBSupplyplan);

        void updateScmBSupplyplan(ScmBSupplyplan scmBSupplyplan);

        void deleteScmBSupplyplans(String[]Ids);
        }