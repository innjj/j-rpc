/*
 * Copyright (C) 2010-2111 sunjumper@163.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package jrouter.rpc.support;

import java.util.List;

/**
 * 标识可记录ID属性的有序数据集。
 *
 * @param <ID> ID type.
 */
public interface Recordable<ID> {

    /**
     * 返回ID集合。
     *
     * @return ID集合。
     */
    List<ID> getRecords();

    /**
     * 设置ID集合。
     *
     * @param ids ID集合。
     */
    void setRecords(List<ID> ids);
}
