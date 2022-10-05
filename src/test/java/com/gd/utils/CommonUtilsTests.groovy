package com.gd.utils

import com.gd.GradleDemoApplicationTests
import com.gd.pojo.Department
import com.gd.pojo.User
import org.junit.jupiter.api.Test

class CommonUtilsTests extends GradleDemoApplicationTests {

    @Test
    void 'test getName with Department'() {
        given:
        def departmentName = "Department001"
        def department = new Department().setName(departmentName).setId("001")
        when:
        def result = CommonUtils.getName(department)
        then:
        assert result == departmentName
    }

    @Test
    void 'test getName with User'() {
        given:
        def userName = "Department001"
        def department = new User().setName(userName).setId("001")
        when:
        def result = CommonUtils.getName(department)
        then:
        assert result == userName
    }
}
