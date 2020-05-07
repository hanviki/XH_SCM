package cc.mrbird.febs.scm.dao;

import cc.mrbird.febs.scm.entity.ScmBSupplyplan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 供应计划 Mapper 接口
 * </p>
 *
 * @author viki
 * @since 2019-11-21
 */
public interface ScmBSupplyplanMapper extends BaseMapper<ScmBSupplyplan> {
        void updateScmBSupplyplan(ScmBSupplyplan scmBSupplyplan);

        Long IsOutMenge(@Param(value = "plan") ScmBSupplyplan scmBSupplyplan);

        int IsExistFphm(@Param(value="id") String id,@Param(value="fphm") String fphm,@Param(value="gys") String gys);

        @Update("update Scm_B_Supplyplan set doneMenge=ifnull(doneMenge,0) + ${doneMenge} where id=${id} and status=0")
        int UpdateDoneMenge(@Param(value="id") String id, @Param(value="doneMenge")String doneMenge);

        @Update("update Scm_B_Supplyplan set doneMenge=0 where id=${id} and status=0")
        int UpdateCancelDoneMenge(@Param(value="id") String id);

        void doneSupplyPlan(@Param("ids") List<Long> ids);

        void cancelSupplyPlan(@Param("ids") List<Long> ids);


        List<ScmBSupplyplan> getAllPlansByIds(@Param(value = "ids") List<String> ids);

        @Select("select COUNT(1) from Scm_B_Supplyplan where id in (${ids}) and Is_Deletemark=1 and LENGTH(SEND_ORDER_CODE)>0")
        Long hasSendOrder(@Param(value="ids") String ids);
        }
