package com.testproject.swp.exception.custom;

import com.testproject.swp.model.mapper.CustomError;

public class CustomBadReqEx extends BaseEx {

    public CustomBadReqEx(CustomError customError) {
        super(customError);
    }

}
