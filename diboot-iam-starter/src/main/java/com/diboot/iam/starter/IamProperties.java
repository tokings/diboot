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
package com.diboot.iam.starter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

/**
 * 认证相关的配置参数
 * @author mazc@dibo.ltd
 * @version v2.0
 * @date 2019/12/23
 */
@Getter @Setter
@ConfigurationProperties(prefix = "diboot.iam")
public class IamProperties {
    /**
     * 应用程序
     */
    private String application;

    /**
     * jwt header key
     */
    private String jwtHeaderKey = "authtoken";

    /**
     * jwt 签名key
     */
    private String jwtSignkey = "Diboot";

    /**
     * jwt token过期分钟数
     */
    private int jwtTokenExpiresMinutes = 60;

    /**
     * 匿名的url，以,逗号分隔
     */
    private Set<String> anonUrls;
    /**
     * 是否初始化SQL
     */
    private boolean initSql = true;
    /**
     * 是否开启权限检查（开发环境可关闭方便调试）
     */
    private boolean enablePermissionCheck = true;
    /**
     * 是否开启无状态 Jwt 身份验证过滤器
     */
    private boolean enableStatelessSession = false;
}
