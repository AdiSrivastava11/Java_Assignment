package collection;

import java.util.Comparator;

public class ComparatorEmplDeptnum implements Comparator<Employee>{

    public int compare(Employee e1,Employee e2)
    {
        System.out.println("comparing e1.deptno:"+e1.getDeptno()+" and e2.deptno:"+e2.getDeptno());
        return(int)(e1.getDeptno() + e2.getDeptno());
    

}
}

