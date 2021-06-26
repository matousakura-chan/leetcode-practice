package com.chen.leetcode.SixNineZero;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }


    private HashMap<Integer,Employee> map = new HashMap<>();
    int sum = 0;

    public int getImportance(List<Employee> employees, int id) {

        for (Employee employee:employees)
            map.put(employee.id,employee);

        if(map.get(id)!=null){
            dfs(id);
            return sum + map.get(id).importance;
        }
        return 0;

    }

    private void dfs(int id){

        Employee leader = map.get(id);
        if(leader == null) return;
        for (Integer employeeId :leader.subordinates) {
            Employee employee = map.get(employeeId);
            sum += employee.importance;
            for (Integer subEmployeeId :employee.subordinates) {
                dfs(subEmployeeId);
            }
        }
    }
}