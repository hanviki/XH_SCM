package cc.mrbird.febs.scm.service.impl;

import cc.mrbird.febs.common.domain.QueryRequest;
import cc.mrbird.febs.common.utils.SortUtil;
import cc.mrbird.febs.scm.entity.ScmDMater;
import cc.mrbird.febs.scm.dao.ScmDMaterMapper;
import cc.mrbird.febs.scm.service.IScmDMaterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.time.LocalDate;
/**
 * <p>
 * 药品物料库 服务实现类
 * </p>
 *
 * @author viki
 * @since 2019-11-11
 */
@Slf4j
@Service("IScmDMaterService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ScmDMaterServiceImpl extends ServiceImpl<ScmDMaterMapper, ScmDMater> implements IScmDMaterService {


@Override
public IPage<ScmDMater> findScmDMaters(QueryRequest request, ScmDMater scmDMater){
        try{
        LambdaQueryWrapper<ScmDMater> queryWrapper=new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(scmDMater.getCode())) {
        queryWrapper.eq(ScmDMater::getCode, scmDMater.getCode());
        }
        Page<ScmDMater> page=new Page<>();
        SortUtil.handlePageSort(request,page,true);
        return this.page(page,queryWrapper);
        }catch(Exception e){
        log.error("获取字典信息失败" ,e);
        return null;
        }
        }

@Override
@Transactional
public void createScmDMater(ScmDMater scmDMater){
        scmDMater.setId(UUID.randomUUID().toString());
        scmDMater.setCreateTime(LocalDateTime.now());
        this.save(scmDMater);
        }

@Override
@Transactional
public void updateScmDMater(ScmDMater scmDMater){
        scmDMater.setModifyTime(LocalDateTime.now());
        this.baseMapper.updateScmDMater(scmDMater);
        }

@Override
@Transactional
public void deleteScmDMaters(String[]Ids){
        List<String> list=Arrays.asList(Ids);
        this.baseMapper.deleteBatchIds(list);
        }


        }