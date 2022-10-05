package com.gd.service.impl

import com.gd.service.UserService
import com.gd.utils.CommonUtils
import org.springframework.stereotype.Service

@Service
class UserServiceImpl implements UserService {

    @Override
    String getNameById(Serializable userId) {
        return String.format("%s:%s", CommonUtils.getCurrentTime(), userId)
    }

}
