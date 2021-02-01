package com.digite.kata.workflow;

import org.junit.Before;
import org.junit.Test;

public class ManagerTest {

    Worker worker1;
    Worker worker2;
    Manager manager;
    @Before
    public void setUp()
    {
        worker1 = new JuniorWorker();
        worker2 = new RobotWorker();
        manager = new Manager();
    }

    @Test
    public void testManageJuniorWorker()
    {
        manager.setWorker(worker1);
       // manager.manage();
    }
    @Test
    public void testManageRobotWorker()
    {
        manager.setWorker(worker2);
        // manager.manage();
    }
}
