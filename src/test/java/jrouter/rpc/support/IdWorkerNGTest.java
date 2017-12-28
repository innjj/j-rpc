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

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * IdWorkerNGTest.
 */
public class IdWorkerNGTest {

    /**
     * Test of nextId method, of class IdWorker.
     */
    @Test
    public void testNextId() {
        IdWorker idGenerator = new IdWorker(0, 0);
        long id = idGenerator.nextId();
        assertEquals(idGenerator.parseWorkerId(id), 0);

        assertEquals(idGenerator.parseSequence(id), 0);
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * (idGenerator.getMaxWorkerId() + 1));
            int y = (int) (Math.random() * (idGenerator.getMaxDatacenterId() + 1));
            idGenerator = new IdWorker(x, y);
            id = idGenerator.nextId();
            assertEquals(idGenerator.parseWorkerId(id), x);
            assertEquals(idGenerator.parseDatacenterId(id), y);
            assertEquals(idGenerator.parseSequence(id), 0);
        }
    }

}
