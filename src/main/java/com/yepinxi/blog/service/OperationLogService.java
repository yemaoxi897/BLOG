package com.yepinxi.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yepinxi.blog.dto.OperationLogDTO;
import com.yepinxi.blog.vo.PageResult;
import com.yepinxi.blog.entity.OperationLog;
import com.yepinxi.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 * @author yepinxi
 * @date 
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
