package com.yu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yu.reggie.dto.SetmealDto;
import com.yu.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    /**
     * 回显套餐信息
     * @param id
     * @return
     */
    public SetmealDto getByIdWithDish(Long id);

    /**
     * 修改套餐信息
     * @param setmealDto
     */
    public void updateWithDish(SetmealDto setmealDto);
}
