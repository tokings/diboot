/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.iam.vo;

import com.diboot.core.binding.annotation.BindDict;
import com.diboot.core.binding.annotation.BindEntityList;
import com.diboot.core.binding.annotation.BindField;
import com.diboot.iam.entity.IamOrg;
import com.diboot.iam.entity.IamRole;
import com.diboot.iam.entity.IamUser;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
* 系统用户 VO定义
* @author mazc@dibo.ltd
* @version 2.0
* @date 2019-12-17
*/
@Getter
@Setter
@Accessors(chain = true)
public class IamUserVO extends IamUser {
    private static final long serialVersionUID = 7571698765478647277L;

    private String username;

    @BindField(entity = IamOrg.class, field = "shortName", condition = "this.org_id=id")
    private String orgShortName;

    @BindDict(type="GENDER", field = "gender")
    private String genderLabel;

    @BindDict(type="USER_STATUS", field = "status")
    private String statusLabel;

    // 字段关联：this.id=iam_user_role.user_id AND iam_user_role.role_id=id
    @BindEntityList(entity = IamRole.class, condition = "this.id=iam_user_role.user_id AND iam_user_role.role_id=id")
    private List<IamRole> roleList;
}