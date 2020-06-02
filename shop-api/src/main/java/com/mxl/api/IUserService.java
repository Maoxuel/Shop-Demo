package com.mxl.api;

import com.mxl.entity.Result;
import com.mxl.shop.pojo.TradeUser;
import com.mxl.shop.pojo.TradeUserMoneyLog;

public interface IUserService {
    TradeUser findOne(Long userId);

    Result updateMoneyPaid(TradeUserMoneyLog userMoneyLog);
}
