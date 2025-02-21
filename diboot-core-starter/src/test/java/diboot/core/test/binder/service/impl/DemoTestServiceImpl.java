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
package diboot.core.test.binder.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diboot.core.service.impl.BaseServiceImpl;
import diboot.core.test.binder.entity.DemoTest;
import diboot.core.test.binder.entity.Role;
import diboot.core.test.binder.mapper.DemoTestMapper;
import diboot.core.test.binder.mapper.RoleMapper;
import diboot.core.test.binder.service.DemoTestService;
import diboot.core.test.binder.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 员工相关Service
 * @author mazc@dibo.ltd
 * @version 2018/12/23
 */
@Service
public class DemoTestServiceImpl extends BaseServiceImpl<DemoTestMapper, DemoTest> implements DemoTestService {

}
